package csen1002.main.task1;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

class Transition implements Comparable<Transition> {
	private int from, to;
	private String symbol;

	public Transition(int from, int to, String symbol) {
		this.from = from;
		this.to = to;
		this.symbol = symbol;
	}

	public String toString() {
		return String.format("%d,%s,%d", from, symbol, to);
	}

	@Override
	public int compareTo(Transition o) {
		if (from != o.from) {
			return from - o.from;
		}
		if (!symbol.equals(o.symbol)) {
			return symbol.compareTo(o.symbol);
		}
		return to - o.to;
	}
}

class Node {
	private int id;
	private HashMap<String, LinkedList<Node>> links;

	public Node(int id) {
		this.id = id;
		links = new HashMap<>();
	}

	public void addLink(String symbol, Node node) {
		if (links.get(symbol) == null) {
			links.put(symbol, new LinkedList<>());
		}
		links.get(symbol).add(node);
	}

	public ArrayList<Transition> getTransitions() {
		ArrayList<Transition> transitions = new ArrayList<>();
		for (Map.Entry<String, LinkedList<Node>> entry : links.entrySet()) {
			for (Node node : entry.getValue()) {
				transitions.add(new Transition(id, node.id, entry.getKey()));
			}
		}
		return transitions;
	}

	public void copyLinksTo(Node node) {
		for (Map.Entry<String, LinkedList<Node>> entry : links.entrySet()) {
			for (Node n : entry.getValue()) {
				node.addLink(entry.getKey(), n);
			}
		}
	}

	public LinkedList<Node> getAllToNodes() {
		LinkedList<Node> nodes = new LinkedList<>();
		for (LinkedList<Node> list : links.values()) {
			for (Node node : list) {
				nodes.add(node);
			}
		}
		return nodes;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + "";
	}
}

class NFA {
	Node start, end;

	void setStart(Node start) {
		this.start = start;
	}

	void setEnd(Node end) {
		this.end = end;
	}
}

public class RegExToNfa {

	NFA nfa;
	String alphabet;
	TreeSet<Integer> states = new TreeSet<Integer>();
	int nodeIdCounter = 0;

	/**
	 * Constructs an NFA corresponding to a regular expression based on Thompson's
	 * construction
	 * 
	 * @param input The alphabet and the regular expression in postfix notation for
	 *              which the NFA is to be constructed
	 */
	public RegExToNfa(String input) {
		StringTokenizer st = new StringTokenizer(input, "#");

		// We store the alphabet to be output in the toString method
		this.alphabet = st.nextToken();
		String regex = st.nextToken();
		Stack<NFA> stack = new Stack<>();
		for (int i = 0; i < regex.length(); ++i) {
			char c = regex.charAt(i);
			switch (c) {
				case '*': {
					NFA nfa = stack.pop();
					NFA result = handleKleeneStar(nfa);
					stack.push(result);
					break;
				}
				case '.': {
					NFA secondNFA = stack.pop(), firstNFA = stack.pop();
					NFA result = handleConcatenation(firstNFA, secondNFA);
					stack.push(result);
					break;
				}
				case '|': {
					NFA secondNFA = stack.pop(), firstNFA = stack.pop();
					NFA result = handleOr(firstNFA, secondNFA);
					stack.push(result);
					break;
				}
				default: {
					NFA nfa = handleLetter(Character.toString(c));
					stack.push(nfa);
					break;
				}
			}
		}

		this.nfa = stack.pop();
	}

	private NFA handleLetter(String letter) {
		NFA nfa = new NFA();
		nfa.setStart(createNode());
		nfa.setEnd(createNode());
		nfa.start.addLink(letter, nfa.end);
		return nfa;
	}

	private NFA handleKleeneStar(NFA nfa) {
		// Creates epsilon transition from end to start
		nfa.end.addLink("e", nfa.start);

		// Creates new start and end nodes with epsilon transitions
		Node newStart = createNode();
		newStart.addLink("e", nfa.start);

		Node newEnd = createNode();
		nfa.end.addLink("e", newEnd);

		newStart.addLink("e", newEnd);

		NFA result = new NFA();
		result.setStart(newStart);
		result.setEnd(newEnd);

		return result;
	}

	private NFA handleConcatenation(NFA nfa1, NFA nfa2) {
		// Copies the transitions of nfa2.start to nfa1.end
		nfa2.start.copyLinksTo(nfa1.end);
		states.remove(nfa2.start.getId());

		NFA result = new NFA();
		result.setStart(nfa1.start);
		result.setEnd(nfa2.end);

		return result;
	}

	private NFA handleOr(NFA nfa1, NFA nfa2) {
		Node newStart = createNode();
		newStart.addLink("e", nfa1.start);
		newStart.addLink("e", nfa2.start);

		Node newEnd = createNode();
		nfa1.end.addLink("e", newEnd);
		nfa2.end.addLink("e", newEnd);

		NFA result = new NFA();
		result.setStart(newStart);
		result.setEnd(newEnd);

		return result;
	}

	private Node createNode() {
		Node node = new Node(nodeIdCounter++);
		states.add(node.getId());
		return node;
	}

	/**
	 * @return Returns a formatted string representation of the NFA. The string
	 *         representation follows the one in the task description
	 */
	@Override
	public String toString() {
		TreeSet<Transition> transitions = new TreeSet<>();

		// BFS to find all transitions
		HashSet<Integer> processed = new HashSet<Integer>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(nfa.start);
		processed.add(nfa.start.getId());
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			transitions.addAll(node.getTransitions());
			for (Node other : node.getAllToNodes()) {
				if (!processed.contains(other.getId())) {
					queue.add(other);
					processed.add(other.getId());
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		// Adds Q
		for (Integer id : states) {
			sb.append(id + ";");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("#");
		// Adds A
		sb.append(this.alphabet);
		sb.append("#");
		// Adds T
		for (Transition transition : transitions) {
			sb.append(transition.toString());
			sb.append(";");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("#");
		// Adds I
		sb.append(nfa.start.getId());
		sb.append("#");
		// Adds F
		sb.append(nfa.end.getId());
		return sb.toString();
	}

	public static void main(String[] args) {
		// RegExToNfa regExToNfa = new RegExToNfa("a;b#a*");
		RegExToNfa regExToNfa = new RegExToNfa("a;o;z#za|*o.");
		System.out.println(regExToNfa.toString());
	}
}

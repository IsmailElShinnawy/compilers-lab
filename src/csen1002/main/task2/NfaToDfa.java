package csen1002.main.task2;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

class Node {
	private String id;
	private HashMap<String, LinkedList<Node>> links;

	public Node(String id) {
		this.id = id;
		links = new HashMap<>();
	}

	public void addLink(String symbol, Node node) {
		LinkedList<Node> list = links.get(symbol);
		if (list == null) {
			list = new LinkedList<>();
			links.put(symbol, list);
		}
		list.add(node);
	}

	public String getId() {
		return this.id;
	}

	public HashSet<Node> getEpsilonClosure() {
		HashSet<Node> reachableNodes = new HashSet<>();
		HashSet<Node> visited = new HashSet<>();
		Queue<Node> q = new LinkedList<>();
		q.add(this);
		visited.add(this);
		while (!q.isEmpty()) {
			Node node = q.poll();
			reachableNodes.add(node);
			LinkedList<Node> epsilonNodes = node.links.get("e");
			if (epsilonNodes != null) {
				for (Node epsilonNode : epsilonNodes) {
					if (!visited.contains(epsilonNode)) {
						q.add(epsilonNode);
						visited.add(epsilonNode);
					}
				}
			}
		}
		return reachableNodes;
	}

	public LinkedList<Node> getReachableNodesFromSymbol(String symbol) {
		LinkedList<Node> reachableNodes = links.get(symbol);
		if (reachableNodes == null) {
			reachableNodes = new LinkedList<>();
		}
		return reachableNodes;
	}
}

class DfaNode extends Node {
	private ArrayList<Node> nfaNodes;

	public DfaNode(ArrayList<Node> nfaNodes) {
		super(getIdFrom(nfaNodes));
		this.nfaNodes = nfaNodes;
	}

	public static String getIdFrom(ArrayList<Node> nfaNodes) {
		StringBuilder sb = new StringBuilder();
		TreeSet<Node> sortedNodes = new TreeSet<>(
				(nodeA, nodeB) -> Integer.parseInt(nodeA.getId()) - Integer.parseInt(nodeB.getId()));
		for (Node node : sortedNodes) {
			sb.append(node.getId()).append("/");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}

	public ArrayList<Node> getNfaNodes() {
		return this.nfaNodes;
	}
}

class FA {
	private Node start;
	private HashSet<Node> acceptStates;
	private HashMap<String, Node> nodes;

	public FA() {
		this.acceptStates = new HashSet<>();
		this.nodes = new HashMap<>();
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public void addToAcceptStates(Node node) {
		this.acceptStates.add(node);
	}

	private void addNode(Node node) {
		this.nodes.put(node.getId(), node);
	}

	public Node getStart() {
		return this.start;
	}

	public Node getNodeOrCreate(String nodeId) {
		Node node = this.getNode(nodeId);
		if (node == null) {
			node = new Node(nodeId);
			this.addNode(node);
		}
		return node;
	}

	public Node getNode(String nodeId) {
		return this.nodes.get(nodeId);
	}
}

public class NfaToDfa {

	private FA nfa, dfa;
	private String[] alphabet;

	/**
	 * Constructs a DFA corresponding to an NFA
	 * 
	 * @param input A formatted string representation of the NFA for which an
	 *              equivalent DFA is to be constructed. The string representation
	 *              follows the one in the task description
	 */
	public NfaToDfa(String input) {
		this.nfa = new FA();
		StringTokenizer st = new StringTokenizer(input, "#");
		st.nextToken(); // skip Q
		this.alphabet = st.nextToken().split(";");
		String transitions = st.nextToken();
		StringTokenizer transitionsSt = new StringTokenizer(transitions, ";");
		while (transitionsSt.hasMoreTokens()) {
			String transition = transitionsSt.nextToken();
			StringTokenizer transitionSt = new StringTokenizer(transition, ",");
			String from = transitionSt.nextToken();
			String symbol = transitionSt.nextToken();
			String to = transitionSt.nextToken();
			Node fromNode = nfa.getNodeOrCreate(from);
			Node toNode = nfa.getNodeOrCreate(to);
			fromNode.addLink(symbol, toNode);
		}
		String startId = st.nextToken();
		nfa.setStart(nfa.getNode(startId));
		String acceptStates = st.nextToken();
		StringTokenizer acceptStatesSt = new StringTokenizer(acceptStates, ",");
		while (acceptStatesSt.hasMoreTokens()) {
			String acceptStateId = acceptStatesSt.nextToken();
			nfa.addToAcceptStates(nfa.getNode(acceptStateId));
		}

		constructDfa();
	}

	private void constructDfa() {
		Node dead = dfa.getNodeOrCreate("-1");
		for (String symbol : alphabet) {
			dead.addLink(symbol, dead);
		}

		ArrayList<Node> initialNfaNodes = new ArrayList<>(nfa.getStart().getEpsilonClosure());

		DfaNode initialDfaNode = new DfaNode(initialNfaNodes);

		dfa.setStart(initialDfaNode);

		HashSet<DfaNode> visited = new HashSet<>();
		Queue<DfaNode> q = new LinkedList<>();
		q.add(initialDfaNode);
		visited.add(initialDfaNode);
		while (!q.isEmpty()) {
			DfaNode dfaNode = q.poll();
			for (String symbol : alphabet) {
				HashSet<Node> reachableNodes = new HashSet<>();
				for (Node nfaNode : dfaNode.getNfaNodes()) {
					LinkedList<Node> reachableNodesFromSymbol = nfaNode.getReachableNodesFromSymbol(symbol);
					for (Node reachableNode : reachableNodesFromSymbol) {
						reachableNodes.addAll(reachableNode.getEpsilonClosure());
					}
				}
				if (reachableNodes.isEmpty()) {
					dfaNode.addLink(symbol, dead);
				} else {
					String id = DfaNode.getIdFrom(new ArrayList<>(reachableNodes));
					DfaNode reachableDfaNode = (DfaNode) dfa.getNodeOrCreate(id);
					dfaNode.addLink(symbol, reachableDfaNode);
					if (!visited.contains(reachableDfaNode)) {
						q.add(reachableDfaNode);
						visited.add(reachableDfaNode);
					}
				}
			}
		}
	}

	/**
	 * @return Returns a formatted string representation of the DFA. The string
	 *         representation follows the one in the task description
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}

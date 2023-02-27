package csen1002.main.task2;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

class Transition implements Comparable<Transition> {
	private Node from, to;
	private String symbol;
	
	public Transition(Node from, String symbol, Node to) {
		this.from = from;
		this.to = to;
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s", from.getId(), symbol, to.getId());
	}

	@Override
	public int compareTo(Transition o) {
		if(this.from.compareTo(o.from) != 0) return this.from.compareTo(o.from);
		if(this.symbol.compareTo(o.symbol) != 0) return this.symbol.compareTo(o.symbol);
		return this.to.compareTo(o.to);
	}
}

class Node implements Comparable<Node> {
	private String id;
	private HashMap<String, LinkedList<Node>> links;
	private boolean isAccept = false; 

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

	public HashMap<String, LinkedList<Node>> getLinks() {
		return this.links;
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

	public boolean isAccept() {
		return this.isAccept;
	}

	public void setAccept(boolean isAccept) {
		this.isAccept = isAccept;
	}

	public Collection<Transition> getTransitions() {
		LinkedList<Transition> transitions = new LinkedList<>();
		for(Map.Entry<String, LinkedList<Node>> entry : this.getLinks().entrySet()) {
			String symbol = entry.getKey();
			LinkedList<Node> nodes = entry.getValue();
			for(Node node : nodes) {
				transitions.add(new Transition(this, symbol, node));
			}
		}
		return transitions;
	}

	@Override
	public String toString() {
		return getId();
	}

	@Override
	public int compareTo(Node o) {
		if(this.getId().equals(o.getId())) return 0;

		String nfaNodesIds[] = this.getId().split("/");
		String oNfaNodesIds[] = o.getId().split("/");

		int minLength = Math.min(nfaNodesIds.length, oNfaNodesIds.length);
		for(int i = 0; i < minLength; ++i) {
			int nfaNodeId = Integer.parseInt(nfaNodesIds[i]);
			int oNfaNodeId = Integer.parseInt(oNfaNodesIds[i]);
			if(nfaNodeId < oNfaNodeId) return -1;
			if(nfaNodeId > oNfaNodeId) return 1;
		}

		return nfaNodesIds.length - oNfaNodesIds.length;
	}

	public static String getIdFrom(Collection<Node> nodes) {
		StringBuilder sb = new StringBuilder();
		TreeSet<Node> sortedNodes = new TreeSet<>(
				(nodeA, nodeB) -> Integer.parseInt(nodeA.getId()) - Integer.parseInt(nodeB.getId()));
		sortedNodes.addAll(nodes);
		for (Node node : sortedNodes) {
			sb.append(node.getId()).append("/");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
}

class FA {
	private Node start;
	private HashMap<String, Node> nodes;

	public FA() {
		this.nodes = new HashMap<>();
	}

	public void setStart(Node start) {
		this.start = start;
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

	public void deleteNode(String nodeId) {
		nodes.remove(nodeId);
	}

	public Collection<Node> getNodes() {
		return this.nodes.values();
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
		this.dfa = new FA();
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
		StringTokenizer acceptStatesSt = new StringTokenizer(acceptStates, ";");
		while (acceptStatesSt.hasMoreTokens()) {
			String acceptStateId = acceptStatesSt.nextToken();
			// System.out.println(acceptStateId);
			nfa.getNode(acceptStateId).setAccept(true);
		}

		constructDfa();
	}

	private void constructDfa() {
		Node dead = dfa.getNodeOrCreate("-1");
		boolean hasLinkToDead = false;
		for (String symbol : alphabet) {
			dead.addLink(symbol, dead);
		}

		ArrayList<Node> initialNfaNodes = new ArrayList<>(nfa.getStart().getEpsilonClosure());
		boolean isInitialAccept = false;
		for(Node node : initialNfaNodes) {
			if(node.isAccept()) {
				isInitialAccept = true;
				break;
			}
		}
		Node initialDfaNode = this.dfa.getNodeOrCreate(Node.getIdFrom(initialNfaNodes));
		initialDfaNode.setAccept(isInitialAccept);
		dfa.setStart(initialDfaNode);

		HashSet<Node> visited = new HashSet<>();
		Queue<Node> q = new LinkedList<>();
		q.add(initialDfaNode);
		visited.add(initialDfaNode);
		while (!q.isEmpty()) {
			Node dfaNode = q.poll();
			for (String symbol : alphabet) {
				HashSet<Node> reachableNodes = new HashSet<>();
				String nfaNodesIds[] = dfaNode.getId().split("/");
				for (String id: nfaNodesIds) {
					Node nfaNode = nfa.getNode(id);
					LinkedList<Node> reachableNodesFromSymbol = nfaNode.getReachableNodesFromSymbol(symbol);
					for (Node reachableNode : reachableNodesFromSymbol) {
						reachableNodes.addAll(reachableNode.getEpsilonClosure());
					}
				}
				if (reachableNodes.isEmpty()) {
					dfaNode.addLink(symbol, dead);
					hasLinkToDead = true;
				} else {
					boolean isAccept = false;
					for (Node nfaNode : reachableNodes) {
						if (nfaNode.isAccept()) {
							isAccept = true;
							break;
						}
					}
					String id = Node.getIdFrom(new ArrayList<>(reachableNodes));
					Node reachableDfaNode = dfa.getNodeOrCreate(id);
					reachableDfaNode.setAccept(isAccept);
					dfaNode.addLink(symbol, reachableDfaNode);
					if (!visited.contains(reachableDfaNode)) {
						q.add(reachableDfaNode);
						visited.add(reachableDfaNode);
					}
				}
			}
		}
		if(!hasLinkToDead) {
			dfa.deleteNode("-1");
		}
	}

	/**
	 * @return Returns a formatted string representation of the DFA. The string
	 *         representation follows the one in the task description
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		TreeSet<Node> sortedNodes = new TreeSet<>();
		TreeSet<Node> sortedAcceptNodes = new TreeSet<>();
		for(Node node: this.dfa.getNodes()) {
			sortedNodes.add(node);
			if(node.isAccept()) {
				sortedAcceptNodes.add(node);
			}
		}
		
		// Adds Q
		for(Node node: sortedNodes) {
			sb.append(node.getId()).append(";");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("#");
		
		// Adds A
		for(String symbol: this.alphabet) {
			sb.append(symbol).append(";");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("#");
		
		// Adds T
		HashSet<Node> visited = new HashSet<Node>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(dfa.getStart());
		visited.add(dfa.getStart());
		TreeSet<Transition> transitions = new TreeSet<>();
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			transitions.addAll(node.getTransitions());
			for (Node other : node.getAllToNodes()) {
				if (!visited.contains(other)) {
					queue.add(other);
					visited.add(other);
				}
			}
		}
		for(Transition transition: transitions) {
			sb.append(transition).append(";");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("#");
		// Adds I
		sb.append(dfa.getStart().getId()).append("#");
		// Adds F
		for(Node node: sortedAcceptNodes) {
			sb.append(node.getId()).append(";");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public static void main(String[] args) {
		NfaToDfa x = new NfaToDfa("0;1;2;3;4;5;6;7;8#j;r;v#0,j,8;0,j,7;0,j,2;0,j,0;0,j,1;0,r,6;0,r,8;0,r,2;0,r,3;0,r,1;0,v,6;0,v,2;0,v,5;0,v,3;0,v,0;0,v,4;0,v,1;1,j,0;1,j,3;1,j,8;1,j,6;1,j,7;1,j,5;1,r,1;1,r,5;1,r,2;1,r,4;1,v,5;1,v,2;1,v,3;1,v,8;1,v,4;1,v,0;2,j,5;2,j,7;2,j,3;2,j,0;2,j,1;2,j,4;2,r,6;2,r,1;2,r,0;2,r,3;2,r,2;2,r,5;2,v,0;2,v,3;2,v,1;2,v,6;3,j,8;3,j,6;3,j,0;3,j,5;3,j,1;3,j,7;3,j,4;3,r,5;3,r,3;3,r,8;3,r,2;3,v,6;3,v,1;3,v,0;3,v,4;3,v,7;3,v,2;3,v,3;4,j,2;4,j,8;4,j,3;4,j,5;4,j,0;4,j,4;4,j,1;4,r,4;4,r,2;4,r,6;4,r,0;4,v,8;4,v,5;4,v,7;4,v,1;5,j,1;5,j,5;5,j,2;5,j,8;5,j,3;5,r,5;5,r,8;5,r,7;5,r,4;5,r,2;5,r,6;5,v,7;5,v,5;5,v,3;5,v,8;6,j,2;6,j,1;6,j,8;6,j,4;6,j,5;6,j,7;6,r,0;6,r,6;6,r,3;6,r,5;6,r,4;6,r,7;6,v,8;6,v,3;6,v,0;6,v,7;6,v,6;6,v,1;6,v,4;7,j,2;7,j,4;7,j,7;7,j,5;7,j,0;7,j,6;7,r,2;7,r,6;7,r,3;7,r,0;7,v,4;7,v,6;7,v,3;7,v,0;8,j,5;8,j,1;8,j,3;8,j,4;8,j,6;8,j,8;8,j,7;8,r,6;8,r,0;8,r,5;8,r,4;8,r,3;8,r,2;8,r,1;8,v,3;8,v,4;8,v,2;8,v,5#1#0;1;4");
		System.out.println(x.toString());
	}

}

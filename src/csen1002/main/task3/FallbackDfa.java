package csen1002.main.task3;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Jane Smith
 * @id 46-0234
 * @labNumber 07
 */

public class FallbackDfa {

	private int initialState;
	private HashSet<Integer> acceptStates = new HashSet<>();
	private HashMap<Integer, HashMap<Character, Integer>> transitions = new HashMap<>();

	private int R, L;
	private Stack<Integer> stack;

	/**
	 * Constructs a Fallback DFA
	 * 
	 * @param fdfa A formatted string representation of the Fallback DFA. The string
	 *             representation follows the one in the task description
	 */
	public FallbackDfa(String fdfa) {
		StringTokenizer st = new StringTokenizer(fdfa, "#");
		st.nextToken(); // skip Q
		st.nextToken(); // skip A
		parseTransitions(st.nextToken());
		initialState = Integer.parseInt(st.nextToken());
		parseAcceptStates(st.nextToken());
	}

	private void addTransition(int from, char symbol, int to) {
		if (!transitions.containsKey(from)) {
			transitions.put(from, new HashMap<Character, Integer>());
		}
		transitions.get(from).put(symbol, to);
	}

	private void parseTransitions(String transitionsString) {
		StringTokenizer st = new StringTokenizer(transitionsString, ";");
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			String tokens[] = t.split(",");
			int from = Integer.parseInt(tokens[0]);
			char c = tokens[1].charAt(0);
			int to = Integer.parseInt(tokens[2]);
			addTransition(from, c, to);
		}
	}

	private void parseAcceptStates(String acceptStatesString) {
		StringTokenizer st = new StringTokenizer(acceptStatesString, ";");
		while (st.hasMoreTokens()) {
			acceptStates.add(Integer.parseInt(st.nextToken()));
		}
	}

	private int getNextState(int state, char symbol) {
		return transitions.get(state).get(symbol);
	}

	/**
	 * @param input The string to simulate by the FDFA.
	 * 
	 * @return Returns a formatted string representation of the list of tokens. The
	 *         string representation follows the one in the task description
	 */
	public String run(String input) {
		StringBuilder ans = new StringBuilder();

		R = 0;
		L = 0;
		stack = new Stack<Integer>();
		int N = input.length();

		stack.push(initialState);
		while (true) {
			if (L == N) {
				if (acceptStates.contains(stack.peek())) {
					ans.append(input.substring(R, L)).append(",").append(stack.peek()).append(";");
					break;
				} else {
					int qr = stack.peek();
					// Fallback
					while (!stack.isEmpty()) {
						L--;
						int popped = stack.pop();
						if (acceptStates.contains(popped)) {
							ans.append(input.substring(R, L + 1)).append(",").append(popped).append(";");
							R = ++L;
							stack.clear();
							stack.push(initialState);
							break;
						}
					}
					// Only need to check if stack is empty, because it is guaranteed that q0 is not
					// an accept state
					if (stack.isEmpty()) {
						ans.append(input.substring(R, N)).append(",").append(qr).append(";");
						break;
					}
				}
			}
			char c = input.charAt(L++);
			stack.push(getNextState(stack.peek(), c));
		}

		return ans.substring(0, ans.length() - 1);
	}

}

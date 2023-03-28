package csen1002.main.task6;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

public class CfgFirstFollow {

	private Collection<Character> variables, terminals;
	private Map<Character, Set<String>> rules;
	private Map<Character, Set<Character>> first, follow;

	private static int characterComparator(Character a, Character b) {
		if(a == '$') return 1;
		if(b == '$') return -1;
		return a.compareTo(b);
	}

	private void init() {
		variables = new HashSet<>();
		terminals = new HashSet<>();
		rules = new HashMap<>();

		first = new HashMap<>();
		follow = new HashMap<>();
	}

	private void parseVariables(String variablesToken) {
		StringTokenizer st = new StringTokenizer(variablesToken, ";");
		while(st.hasMoreTokens()) {
			variables.add(st.nextToken().charAt(0));
		}
	}

	private void parseTerminals(String terminalsToken) {
		StringTokenizer st = new StringTokenizer(terminalsToken, ";");
		while(st.hasMoreTokens()) {
			terminals.add(st.nextToken().charAt(0));
		}
	}

	private void parseRules(String rulesToken) {
		StringTokenizer st = new StringTokenizer(rulesToken, ";");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			String parts[] = token.split("/");
			char variable = parts[0].charAt(0);
			StringTokenizer innerSt = new StringTokenizer(parts[1], ",");
			while(innerSt.hasMoreTokens()) {
				if(!rules.containsKey(variable)) {
					rules.put(variable, new HashSet<>());
				}
				rules.get(variable).add(innerSt.nextToken());
			}
		}
	}

	private void parseCfg(String cfg) {
		StringTokenizer st = new StringTokenizer(cfg, "#");
		parseVariables(st.nextToken());
		parseTerminals(st.nextToken());
		parseRules(st.nextToken());
	}

	private void populateFirstAndFollow() {
		for(Character v: variables) {
			first.put(v, new TreeSet<>(CfgFirstFollow::characterComparator));
			follow.put(v, new TreeSet<>(CfgFirstFollow::characterComparator));
		}

		follow.get('S').add('$');
	}

	private static boolean isEmpty(String sententialForm) {
		return sententialForm.length() == 0;
	}

	private Set<String> getAllPossibleNextSententialForms(String sententialForm) {
		Set<String> result = new HashSet<>();
		
		for(int i = 0; i < sententialForm.length(); ++i) {
			if(variables.contains(sententialForm.charAt(i))) {
				Set<String> productions = rules.get(sententialForm.charAt(i));
				for(String production: productions) {
					String s = sententialForm.substring(0, i) + production + sententialForm.substring(i + 1);
					result.add(s.replaceAll("e", ""));
				}
			}
		}

		return result;
	}

	private void dfs(Character startVariable) {
		// Node root = new Node(Character.toString(startVariable));
		String root = Character.toString(startVariable);

		Set<String> visited = new HashSet<>();
		Stack<String> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {
			String sententialForm = stack.pop();
			System.out.println(sententialForm);
			
			// populate first(A)
			if(isEmpty(sententialForm)) {
				first.get(startVariable).add('e');
			} else if(terminals.contains(sententialForm.charAt(0))) {
				first.get(startVariable).add(sententialForm.charAt(0));
			} 

			// populate follow(A)
			for(int i = 0; i < sententialForm.length(); ++i) {
				if(sententialForm.charAt(i) == startVariable) {
					if(i == sententialForm.length() - 1) {
						follow.get(startVariable).add('$');
					} else if(terminals.contains(sententialForm.charAt(i + 1))){
						follow.get(startVariable).add(sententialForm.charAt(i + 1));
					}
				}
			}

			Set<String> allPossibleNextSententialForms = getAllPossibleNextSententialForms(sententialForm);
			for(String next: allPossibleNextSententialForms) {
				if(!visited.contains(next)) {
					visited.add(next);
					stack.push(next);
				}
			}
		}

	}

	private void preprocess() {
		for(Character v: variables) {
			dfs(v);
		}
	}

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG. The string
	 *            representation follows the one in the task description
	 */
	public CfgFirstFollow(String cfg) {
		init();
		parseCfg(cfg);
		populateFirstAndFollow();
		preprocess();
	}

	
	/**
	 * Calculates the First Set of each variable in the CFG.
	 * 
	 * @return A string representation of the First of each variable in the CFG,
	 *         formatted as specified in the task description.
	 */
	public String first() {
		StringBuilder sb = new StringBuilder();
		for(Character v: variables) {
			StringBuilder innerSb = new StringBuilder();
			Set<Character> firstSet = first.get(v);
			if(!firstSet.isEmpty()) {
				for(Character c: firstSet) {
					innerSb.append(c);
				}
				sb.append(v).append("/").append(innerSb).append(";");
			}
		}
		return sb.substring(0, sb.length() - 1);
	}

	/**
	 * Calculates the Follow Set of each variable in the CFG.
	 * 
	 * @return A string representation of the Follow of each variable in the CFG,
	 *         formatted as specified in the task description.
	 */
	public String follow() {
		StringBuilder sb = new StringBuilder();
		for(Character v: variables) {
			StringBuilder innerSb = new StringBuilder();
			Set<Character> followSet = follow.get(v);
			if(!followSet.isEmpty()) {
				for(Character c: followSet) {
					innerSb.append(c);
				}
				sb.append(v).append("/").append(innerSb).append(";");
			}
		}
		return sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		new CfgFirstFollow("S;Z;I;P;B;J;W#b;f;i;m;n;p;s#S/PZb,S,iBbB;Z/II,If,P;I/B,JZPP,SPnJS,SWsI,bBPb,iB;P/JWWfP,S,Ss,e;B/e,pBPBb,sSP;J/BmPZ,Z,iP;W/bZ,mPnWb,pWBfB");
	}

}

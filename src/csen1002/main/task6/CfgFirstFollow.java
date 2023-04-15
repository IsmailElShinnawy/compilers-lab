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
	private Map<String, Set<Character>> first, follow;

	private static int characterComparator(Character a, Character b) {
		if(a == b) return 0;
		if(a == '$') return -1;
		if(b == '$') return 1;
		return a.compareTo(b);
	}

	private void init() {
		variables = new ArrayList<>();
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

	private void initializeFirstAndFollow() {
		for(Character v: variables) {
			first.put(Character.toString(v), new TreeSet<>(CfgFirstFollow::characterComparator));
			follow.put(Character.toString(v), new TreeSet<>(CfgFirstFollow::characterComparator));
		}

		for(Character t: terminals) {
			first.put(Character.toString(t), new TreeSet<>(CfgFirstFollow::characterComparator));
			first.get(Character.toString(t)).add(t);
		}

		first.put("e", new TreeSet<>());
		first.get("e").add('e');
		follow.get("S").add('$');
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
		initializeFirstAndFollow();
	}

	private Set<Character> getFirstIntersectionSet(String sententialForm) {
		List<Set<Character>> firstSets = new ArrayList<>();
		for(int i = 0; i < sententialForm.length(); ++i) {
			firstSets.add(first.get(Character.toString(sententialForm.charAt(i))));
		}
		Set<Character> result = new HashSet<>();
		for(int i = 0; i < firstSets.size(); ++i) {
			for(Character c: firstSets.get(i)) {
				boolean f = true;
				for(int j = 0; j < firstSets.size(); ++j) {
					if(i != j) {
						if(!firstSets.get(j).contains(c)) {
							f = false;
							break;
						}
					}
				}
				if(f) {
					result.add(c);
				}
			}
		}

		return result;
	}

	
	/**
	 * Calculates the First Set of each variable in the CFG.
	 * 
	 * @return A string representation of the First of each variable in the CFG,
	 *         formatted as specified in the task description.
	 */
	public String first() {
		boolean change = true;
		while(change) {
			change = false;
			for(Map.Entry<Character, Set<String>> entry: rules.entrySet()) {
				char v = entry.getKey();
				Set<String> sententialForms = entry.getValue();
				for(String sf: sententialForms) {
					Set<Character> intersectionSetFromB0toBk = getFirstIntersectionSet(sf);
					if(intersectionSetFromB0toBk.contains('e') && !first.get(Character.toString(v)).contains('e')) {
						change = true;
						first.get(Character.toString(v)).add('e');
					}
					for(int i = 0; i < sf.length(); ++i) {
						Set<Character> intersectionSetFromB0toBi = getFirstIntersectionSet(sf.substring(0, i));
						if(i == 0 || intersectionSetFromB0toBi.contains('e')) {
							Set<Character> firstSetForBi = first.get(Character.toString(sf.charAt(i)));
							for(Character c: firstSetForBi) {
								if(c != 'e' && !first.get(Character.toString(v)).contains(c)) {
									change = true;
									first.get(Character.toString(v)).add(c);
								}
							}
						}
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(Character v: variables) {
			sb.append(v).append("/");
			for(Character f: first.get(Character.toString(v))) {
				sb.append(f);
			}
			sb.append(";");
		}

		return sb.substring(0, sb.length() - 1);
	}

	public Set<Character> first(String sententialForm) {
		if(sententialForm.length() == 1) {
			if(terminals.contains(sententialForm.charAt(0)) || sententialForm.equals("e")) {
				return first.get(Character.toString(sententialForm.charAt(0)));
			}
			if(variables.contains(sententialForm.charAt(0))) {
				Set<Character> result = new HashSet<>();
				for(String sf: rules.get(sententialForm.charAt(0))) {
					if(sf.equals("e")) {
						result.add('e');
					} else {
						result.addAll(first(sf));
					}
				}
				return result;
			}
		}
		Set<Character> result = new HashSet<>();
		for(int i = 0; i < sententialForm.length(); ++i) {
			Set<Character> set = getFirstIntersectionSet(sententialForm.substring(0, i));
			if(i == 0 || set.contains('e')) {
				result.addAll(first.get(Character.toString(sententialForm.charAt(i))));
			}
		}
		return result;
	}

	/**
	 * Calculates the Follow Set of each variable in the CFG.
	 * 
	 * @return A string representation of the Follow of each variable in the CFG,
	 *         formatted as specified in the task description.
	 */
	public String follow() {

		first();

		boolean change = true;
		while(change) {
			change = false;
			for(Map.Entry<Character, Set<String>> entry: rules.entrySet()) {
				char v = entry.getKey();
				Set<String> sententialForms = entry.getValue();
				for(String sf: sententialForms) {
					for(int i = 0; i < sf.length(); ++i) {
						if(variables.contains(sf.charAt(i))) {
							String beta = i < sf.length() - 1 ? sf.substring(i) : "e";
							Set<Character> set = first(beta);
							for(Character c: set) {
								if(c != 'e' && !follow.get(Character.toString(sf.charAt(i))).contains(c)) {
									change = true;
									follow.get(Character.toString(sf.charAt(i))).add(c);
								}
							}
							if(set.contains('e')) {
								Set<Character> tempSet = new HashSet<>();
								for(Character c: follow.get(Character.toString(v))) {
									if(!follow.get(Character.toString(sf.charAt(i))).contains(c)) {
										change = true;
										tempSet.add(c);
									}
								}
								follow.get(Character.toString(sf.charAt(i))).addAll(tempSet);
							}
						}
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(Character v: variables) {
			sb.append(v).append("/");
			for(Character f: follow.get(Character.toString(v))) {
				sb.append(f);
			}
			sb.append(";");
		}

		return sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		CfgFirstFollow cfgFirstFollow= new CfgFirstFollow("S;Z;I;P;B;J;W#b;f;i;m;n;p;s#S/PZb,S,iBbB;Z/II,If,P;I/B,JZPP,SPnJS,SWsI,bBPb,iB;P/JWWfP,S,Ss,e;B/e,pBPBb,sSP;J/BmPZ,Z,iP;W/bZ,mPnWb,pWBfB");
		cfgFirstFollow.follow();
	}

}

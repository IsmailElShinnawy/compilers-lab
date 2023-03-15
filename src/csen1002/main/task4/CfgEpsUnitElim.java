package csen1002.main.task4;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Jane Smith
 * @id 46-0234
 * @labNumber 07
 */

public class CfgEpsUnitElim {

	private HashMap<String, TreeSet<String>> rules;
	private LinkedList<String> variables;
	private String terminalsStringRepresentation;

	private void populateVariables(String variablesToken) {
		StringTokenizer st = new StringTokenizer(variablesToken, ";");
		while (st.hasMoreTokens()) {
			variables.add(st.nextToken());
		}
	}

	private void populateRules(String rulesToken) {
		StringTokenizer st = new StringTokenizer(rulesToken, ";");
		while (st.hasMoreTokens()) {
			String ruleParts[] = st.nextToken().split("/");
			String variable = ruleParts[0];
			String sententialFormsToken = ruleParts[1];
			StringTokenizer innerSt = new StringTokenizer(sententialFormsToken, ",");
			while (innerSt.hasMoreTokens()) {
				String sententialForm = innerSt.nextToken();
				if (!rules.containsKey(variable)) {
					rules.put(variable, new TreeSet<>());
				}
				rules.get(variable).add(sententialForm);
			}
		}
	}

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG. The string
	 *            representation follows the one in the task description
	 */
	public CfgEpsUnitElim(String cfg) {
		rules = new HashMap<>();
		variables = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(cfg, "#");
		populateVariables(st.nextToken());
		terminalsStringRepresentation = st.nextToken();
		populateRules(st.nextToken());
	}

	private String getVariablesString() {
		StringBuilder sb = new StringBuilder();
		for (String variable : variables) {
			sb.append(variable).append(";");
		}
		return sb.substring(0, sb.length() - 1);
	}

	private String getRulesString() {
		StringBuilder sb = new StringBuilder();
		for (String variable : variables) {
			sb.append(variable).append("/");
			for (String sententialForm : rules.get(variable)) {
				sb.append(sententialForm).append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append(";");
		}
		return sb.substring(0, sb.length() - 1);
	}

	/**
	 * @return Returns a formatted string representation of the CFG. The string
	 *         representation follows the one in the task description
	 */
	@Override
	public String toString() {
		return String.format("%s#%s#%s", getVariablesString(), terminalsStringRepresentation, getRulesString());
	}

	private TreeSet<String> permuteReplaceWithEpsilon(String sententialForm, String variable) {
		ArrayList<Integer> indices = new ArrayList<>();
		for (int i = 0; i < sententialForm.length(); i++) {
			if (sententialForm.charAt(i) == variable.charAt(0)) {
				indices.add(i);
			}
		}
		if (indices.size() == 0) {
			// Sentential form does not contain the variable
			return new TreeSet<>();
		}
		TreeSet<String> res = new TreeSet<>();
		int N = indices.size();
		int powerSetSize = 1;
		for (int i = 0; i < N; ++i) {
			powerSetSize <<= 1;
		}
		for (int i = 0; i < powerSetSize; ++i) {
			StringBuilder sb = new StringBuilder(sententialForm);
			boolean flag = false;
			for (int j = 0; j < N; ++j) {
				if ((i & (1 << j)) > 0) {
					flag = true;
					sb.setCharAt(indices.get(j), 'e');
				}
			}
			if (flag) {
				String s = sb.toString().replaceAll("e", "");
				res.add(s.length() == 0 ? "e" : s);
			}
		}
		return res;
	}

	private void removeVariable(String variable) {
		variables.remove(variable);
		for (TreeSet<String> sententialForms : rules.values()) {
			HashSet<String> toBeRemoved = new HashSet<>();
			HashSet<String> toBeAdded = new HashSet<>();
			for (String sententialForm : sententialForms) {
				if (sententialForm.contains(variable)) {
					toBeRemoved.add(sententialForm);
					String s = sententialForm.replaceAll(variable, "");
					toBeAdded.add(s.length() == 0 ? "e" : s);
				}
			}
			sententialForms.removeAll(toBeRemoved);
			sententialForms.addAll(toBeAdded);
		}
	}

	/**
	 * Eliminates Epsilon Rules from the grammar
	 */
	public void eliminateEpsilonRules() {
		HashSet<String> epsilonHandedVariables = new HashSet<>();
		boolean changed = true;
		while (changed) {
			changed = false;
			for (Map.Entry<String, TreeSet<String>> entry : rules.entrySet()) {
				String variable = entry.getKey();
				TreeSet<String> sententialForms = entry.getValue();
				boolean removed = sententialForms.removeIf((sententialForm) -> {
					return sententialForm.equals("e");
				});
				if (removed && !epsilonHandedVariables.contains(variable)) {
					epsilonHandedVariables.add(variable);
					changed = true;
					if (sententialForms.size() > 0) {
						for (TreeSet<String> innnerSententialForms : rules.values()) {
							TreeSet<String> toBeAdded = new TreeSet<String>();
							for (String innerSententialForm : innnerSententialForms) {
								toBeAdded.addAll(permuteReplaceWithEpsilon(innerSententialForm, variable));
							}
							innnerSententialForms.addAll(toBeAdded);
						}
					} else {
						removeVariable(variable);
					}
				}
			}
		}
	}

	/**
	 * Eliminates Unit Rules from the grammar
	 */
	public void eliminateUnitRules() {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (Map.Entry<String, TreeSet<String>> entry : rules.entrySet()) {
				String variable = entry.getKey();
				TreeSet<String> sententialForms = entry.getValue();
				HashSet<String> toBeRemoved = new HashSet<>();
				HashSet<String> toBeAdded = new HashSet<>();
				for (String sententialForm : sententialForms) {
					if (rules.keySet().contains(sententialForm)) {
						changed = true;
						toBeRemoved.add(sententialForm);
						toBeAdded.addAll(rules.get(sententialForm));
						toBeAdded.removeIf((s) -> {
							return s.equals(variable);
						});
					}
				}
				sententialForms.addAll(toBeAdded);
				sententialForms.removeAll(toBeRemoved);
			}
		}
	}

}

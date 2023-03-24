package csen1002.main.task5;

import java.util.*;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

public class CfgLeftRecElim {

	private final ArrayList<String> variables;
	private final TreeSet<Character> terminals;
	private final HashMap<String, ArrayList<String>> rules;
	private int initialNumberOfVariables;

	private void parseVariables(String variablesToken) {
		StringTokenizer st = new StringTokenizer(variablesToken, ";");
		while(st.hasMoreTokens()) {
			variables.add(st.nextToken());
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
			String variableToRuleSet = st.nextToken();
			String parts[] = variableToRuleSet.split("/");
			String variable = parts[0];
			String ruleSetToken = parts[1];
			StringTokenizer innerSt = new StringTokenizer(ruleSetToken, ",");
			while(innerSt.hasMoreTokens()) {
				if(!rules.containsKey(variable)) {
					rules.put(variable, new ArrayList<>());
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
		initialNumberOfVariables = variables.size();
	}

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG. The string
	 *            representation follows the one in the task description
	 */
	public CfgLeftRecElim(String cfg) {
		variables = new ArrayList<>();
		terminals = new TreeSet<>();
		rules = new HashMap<>();

		parseCfg(cfg);
	}

	private String getVariablesString() {
		StringBuilder sb = new StringBuilder();
		for(String v: variables) {
			sb.append(v).append(";");
		}
		return sb.substring(0, sb.length() - 1);
	}

	private String getTerminalsString() {
		StringBuilder sb = new StringBuilder();
		for(Character t: terminals) {
			sb.append(t).append(";");
		}
		return sb.substring(0, sb.length() - 1);
	}

	private String getRulesString() {
		StringBuilder sb = new StringBuilder();
		for(String v: variables) {
			sb.append(v).append("/");
			for(String s: rules.get(v)) {
				sb.append(s).append(",");
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
		return String.format("%s#%s#%s", getVariablesString(), getTerminalsString(), getRulesString());
	}

	private void eliminateImmediateLeftRecursion(int idx) {
		String variable = variables.get(idx);
		ArrayList<String> newRulesListForVariable = new ArrayList<>();
		ArrayList<String> rulesListForVariablePrime = new ArrayList<>();
		for(String sententialForm: rules.get(variable)) {
			if(Character.toString(sententialForm.charAt(0)).equals(variable)) {
				rulesListForVariablePrime.add(sententialForm.substring(1) + variable + "'");
			} else {
				newRulesListForVariable.add(sententialForm + variable + "'");
			}
		}
		if(rulesListForVariablePrime.size() > 0) {
			String variablePrime = variable + "'";
			variables.add(variablePrime);
			rulesListForVariablePrime.add("e");
			rules.put(variablePrime, rulesListForVariablePrime);
			rules.put(variable, newRulesListForVariable);
		}
	}

	/**
	 * Eliminates Left Recursion from the grammar
	 */
	public void eliminateLeftRecursion() {
		for(int i = 0; i < initialNumberOfVariables; ++i) {
			String Ai = variables.get(i);
			ArrayList<String> rulesListForAi = rules.get(Ai);
			for(int j = 0; j < i; ++j) {
				String Aj = variables.get(j);
				ArrayList<String> rulesListForAj = rules.get(Aj);
				for(int k = 0; k < rulesListForAi.size(); ++k) {
					String sententialFormForAi = rulesListForAi.get(k);
					if(Character.toString(sententialFormForAi.charAt(0)).equals(Aj)) {
						int addedRulesCount = 0;
						rulesListForAi.remove(k);
						for(String sententialFormForAj: rulesListForAj) {
							String newSententialFormForAi = sententialFormForAj + sententialFormForAi.substring(1);
							if(!rulesListForAi.contains(newSententialFormForAi)) {
								rulesListForAi.add(k + addedRulesCount, newSententialFormForAi);
								++addedRulesCount;
							}
						}
						if(addedRulesCount == 0) {
							k--;
						} else {
							k += addedRulesCount - 1;
						}
					}
				}
			}
			eliminateImmediateLeftRecursion(i);
		}
	}

	public static void main(String[] args) {
		CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim("S;Z;G;P;X;H;R#l;m;p;x#S/mG,pHSP;Z/PpRlP,ZH,Zl,lP,mRRH;G/HX,PXZ,PmZmX,Rm,xP;P/XHpZx,pRH;X/RxZG,ZlGx,ZxH,mX,pSRHS;H/HRXP,HZ,mHP,mPPHR,x;R/GZRX,HGP,lSZS,lZSm,pGxG,pS");
		cfgLeftRecElim.eliminateLeftRecursion();
	}

}

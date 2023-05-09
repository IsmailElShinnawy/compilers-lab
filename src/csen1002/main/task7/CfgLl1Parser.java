package csen1002.main.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Write your info here
 * 
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

class Rule {
	public char variable;
	public String sentenialForm;

	public Rule(char variable, String sentenialForm) {
		this.variable = variable;
		this.sentenialForm = sentenialForm;
	}

	@Override
	public String toString() {
		return variable + "->" + sentenialForm;
	}
}

public class CfgLl1Parser {

	private Hashtable<String, Rule> parsingTable = new Hashtable<>();
	private Hashtable<String, Set<Character>> first = new Hashtable<>();
	private Hashtable<Character, Set<Character>> follow = new Hashtable<>();

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG, the First sets of
	 *            each right-hand side, and the Follow sets of each variable. The
	 *            string representation follows the one in the task description
	 */
	public CfgLl1Parser(String input) {
		String parts[] = input.split("#");

		String terminalsToken = parts[1] + ";" + '$';
		List<Character> terminals = Arrays.stream(terminalsToken.split(";")).map(s -> s.charAt(0)).toList();

		StringTokenizer st = new StringTokenizer(parts[2], ";");

		List<Rule> rules = new ArrayList<>();

		while (st.hasMoreTokens()) {
			String ruleParts[] = st.nextToken().split("/");
			char variable = ruleParts[0].charAt(0);
			StringTokenizer innerSt = new StringTokenizer(ruleParts[1], ",");
			while (innerSt.hasMoreTokens()) {
				rules.add(new Rule(variable, innerSt.nextToken()));
			}
		}

		st = new StringTokenizer(parts[3], ";");
		int i = 0;
		while (st.hasMoreTokens()) {
			String firstParts[] = st.nextToken().split("/");
			StringTokenizer innerSt = new StringTokenizer(firstParts[1], ",");
			while (innerSt.hasMoreTokens()) {
				String sf = rules.get(i++).sentenialForm;
				if (!first.containsKey(sf)) {
					first.put(sf, new HashSet<>());
				}
				String firstChars = innerSt.nextToken();
				for (int j = 0; j < firstChars.length(); ++j) {
					first.get(sf).add(firstChars.charAt(j));
				}
			}
		}

		st = new StringTokenizer(parts[4], ";");
		while (st.hasMoreTokens()) {
			String followParts[] = st.nextToken().split("/");
			Character variable = followParts[0].charAt(0);
			String followChars = followParts[1];
			if (!follow.containsKey(variable)) {
				follow.put(variable, new HashSet<>());
			}
			for (int j = 0; j < followChars.length(); ++j) {
				follow.get(variable).add(followChars.charAt(j));
			}
		}

		for (Rule r : rules) {
			for (Character t : terminals) {
				if (first.get(r.sentenialForm).contains(t)
						|| (first.get(r.sentenialForm).contains('e') && follow.get(r.variable).contains(t))) {
					parsingTable.put(String.format("%s#%s", r.variable, t), r);
				}
			}
		}
	}

	/**
	 * @param input The string to be parsed by the LL(1) CFG.
	 * 
	 * @return A string encoding a left-most derivation.
	 */
	public String parse(String input) {
		Stack<Character> stack = new Stack<>();
		String modInput = input + "$";
		stack.push('$');
		stack.push('S');
		int i = 0;
		LinkedList<String> derivation = new LinkedList<>();
		derivation.add("S");
		while (stack.peek() != '$' && i < modInput.length()) {
			Character topOfStack = stack.peek();
			if (topOfStack == 'e') {
				stack.pop();
			} else if (Character.isLowerCase(topOfStack)) {
				if (topOfStack == modInput.charAt(i)) {
					stack.pop();
					++i;
				} else {
					break;
				}
			} else {
				String key = String.format("%s#%s", topOfStack, modInput.charAt(i));
				if (parsingTable.containsKey(key)) {
					Rule rule = parsingTable.get(key);
					stack.pop();
					for (int j = rule.sentenialForm.length() - 1; j >= 0; --j) {
						stack.push(rule.sentenialForm.charAt(j));
					}
					derivation.add(derivation.getLast().replaceFirst(Character.toString(topOfStack),
							rule.sentenialForm).replaceAll("e", ""));
				} else {
					break;
				}
			}
		}

		if (stack.size() != 1 || i != modInput.length() - 1) {
			derivation.add("ERROR");
		}

		return String.join(";", derivation);
	}

	public static void main(String[] args) {
		CfgLl1Parser x = new CfgLl1Parser(
				"S;Z;H;E;V#b;c;f;i;k;l;u#S/fE,u;Z/l,uHkZ;H/uHk,lV,b,e;E/fZcZ,iZi,lH,e;V/c,iE#S/f,u;Z/l,u;H/u,l,b,e;E/f,i,l,e;V/c,i#S/$;Z/ci;H/$k;E/$k;V/$k");
		System.out.println(x.first);
		System.out.println(x.follow);
		System.out.println(x.parsingTable);
		x.parse("fiubkuu");
	}

}

/**
 * Write your info here
 *
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

grammar Task9;

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}

s returns [int check]:
// Write the definition of parser rule "s" here
    a c [$a.twoN, $a.threeN, 0, 1] b {$check = $c.slf * $c.suf * equals($a.n, $b.n);};

// Write additional lexer and parser rules here
a returns [int n, int twoN, int threeN]:
    'a' A1=a {$n = $A1.n + 1; $twoN = $A1.twoN * 2; $threeN = $A1.threeN * 3;}
  |          {$n = 0; $twoN = 1; $threeN = 1;};

b returns [int n]:
    'b' B1=b {$n = $B1.n + 1;}
  |          {$n = 0;};

c [int l, int u, int ilf, int iuf] returns [int m, int slf, int suf]:
    'c' C1=c [$l, $u, $ilf, $iuf] {$m = $C1.m + 1; $slf = $C1.slf + equals($l, $m); $suf = $C1.suf - equals($u, $C1.m);}
  |                               {$m = 0; $slf = $ilf; $suf = $iuf;};

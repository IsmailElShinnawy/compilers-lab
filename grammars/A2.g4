grammar A2;

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
    sp              {$check = $sp.check;};

sp returns [int check, int firstRowSum, int firstColSum]:
    r '#' S1=sp     {$firstRowSum = $r.val; $firstColSum = $r.first + $S1.firstColSum; $check = equals($firstRowSum, $firstColSum);}
    | r             {$firstRowSum = $r.val; $firstColSum = $r.first; $check = equals($r.val, $r.first);};

r returns [int val, int first]:
    DIGIT R1=r      {$val = Integer.parseInt($DIGIT.text) + $R1.val; $first = Integer.parseInt($DIGIT.text);}
    | DIGIT         {$val = Integer.parseInt($DIGIT.text);};

DIGIT: [0-9];
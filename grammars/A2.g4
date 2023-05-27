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

sp returns [int check, int firstRowSum, int firstColSum, int colCount, int countCheck]:
    r '#' S1=sp     {$firstRowSum = $r.val;
                        $firstColSum = $r.first + $S1.firstColSum;
                        $colCount = $r.colCount;
                        $countCheck = equals($r.colCount, $S1.colCount);
                        $check = equals($firstRowSum, $firstColSum) * $countCheck * $S1.countCheck;}
    | r             {$firstRowSum = $r.val;
                        $firstColSum = $r.first;
                        $colCount = $r.colCount;
                        $countCheck = 1;
                        $check = equals($r.val, $r.first);};

r returns [int val, int first, int colCount]:
    DIGIT R1=r      {$val = Integer.parseInt($DIGIT.text) + $R1.val;
                        $first = Integer.parseInt($DIGIT.text);
                        $colCount = $R1.colCount + 1;}
    | DIGIT         {$val = Integer.parseInt($DIGIT.text);
                        $first = Integer.parseInt($DIGIT.text);
                        $colCount = 1;};

DIGIT: [0-9];
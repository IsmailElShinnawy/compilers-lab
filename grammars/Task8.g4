/**
 * Write your info here
 *
 * @name Ismail El Shinnawy
 * @id 46-4847
 * @labNumber 18
 */

grammar Task8;

/**
 * This rule is to check your grammar using "ANTLR Preview"
 */
test: (IF | ELSE | COMP | ID | NUM | LIT | LP | RP | WS)+ EOF;

// Write all the necessary lexer rules and fragment lexer rules here
IF options { caseInsensitive=true; }: 'if';
ELSE options { caseInsensitive=true; }: 'else';
COMP: '>' | '<' | '>=' | '<=' | '==' | '!=';
ID: (LETTER | UNDERSCORE) (LETTER | UNDERSCORE | DIGIT)*;
NUM: DIGIT+ ('.' DIGIT+)? ([eE] ('+' | '-')? DIGIT+)?;
LIT: '"' LIT_CHAR*? '"';
LP: '(';
RP: ')';
WS: [ \t\r\n]+ -> skip;

fragment LETTER: [a-zA-Z];
fragment UNDERSCORE: '_';
fragment DIGIT: [0-9];
fragment LIT_CHAR: '\\\\' | '\\"' | ~[\\"];
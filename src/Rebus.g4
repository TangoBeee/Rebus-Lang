grammar Rebus;

// Parser rules
program: statement+;

statement:
    printStatement
    | variableDeclaration
    | variableAssignment
    | expression
    ;

printStatement: 'print' expression;

variableDeclaration: ('int' | 'string') ID ('=' expression)?;

variableAssignment: ID '=' expression;

expression:
    '(' expression ')'
    | '-' expression
    | expression op=(MUL | DIV | ADD | SUB) expression
    | atom
    ;

atom: ID | INT | STRING;

// Lexer rules
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
INT: [0-9]+;
STRING: '"' ~["\r\n]* '"';
WS: [ \t\r\n]+ -> skip;

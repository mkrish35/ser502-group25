// File: Mint.g4
// Author: Kiran Venkatachalam, Monisha Krishnamurthy, Rahul Ravindra Reddy, Vishnu Kumar Adhilakshmi Kalidas
// Purpose: Grammar definition for Mint language parser using ANTLR4
// Version: 5.0

grammar Mint;

@header {
package gen;
}

// =====================
// Lexer Rules
// =====================

MINT_IF       : 'mint_if';
MINT_ELSE     : 'mint_else';
MINT_ELSEIF   : 'mint_elseif';
MINT_FOR      : 'mint_for';
MINT_WHILE    : 'mint_while';
MINT_BREAK    : 'mint_break';
MINT_CONTINUE : 'mint_continue';
SAY           : 'say';
SAYLN         : 'sayln';
T_IF          : '?';
T_ELSE        : ':';

AND           : 'and';
OR            : 'or';
NOT           : 'not';

ADD           : '+';
SUB           : '-';
MUL           : '*';
DIV           : '/';
MOD           : '%';

EQ            : '==';
NEQ           : '!=';
LT            : '<';
LTE           : '<=';
GT            : '>';
GTE           : '>=';

ASSIGN        : '=';
SEMI          : ';';
COMMA         : ',';
LPAREN        : '(';
RPAREN        : ')';
LBRACE        : '{';
RBRACE        : '}';

INT_TYPE      : 'mint_int';
FLOAT_TYPE    : 'mint_float';
STRING_TYPE   : 'mint_string';
BOOL_TYPE     : 'mint_bool';

BOOL          : 'true' | 'false';
NUMBER        : [0-9]+('.'[0-9]+)?;
STRING        : '"' .*? '"';
IDENTIFIER    : [a-zA-Z_][a-zA-Z_0-9]*;

WS            : [ \t\r\n]+ -> skip;
LINE_COMMENT  : '//' ~[\r\n]* -> skip;

// =====================
// Parser Rules
// =====================

program
    : statement* EOF
    ;

statement
    : declaration
    | assignment
    | printStatement
    | ifStatement
    | whileLoop
    | forLoop
    | breakStatement
    | continueStatement
    | expressionStatement
    ;

declaration
    : type IDENTIFIER (ASSIGN expression)? SEMI
    ;

assignment
    : IDENTIFIER ASSIGN expression SEMI
    ;

printStatement
    : SAY LPAREN expression RPAREN SEMI
    | SAYLN LPAREN expression RPAREN SEMI
    ;

ifStatement
    : MINT_IF LPAREN expression RPAREN block
      (MINT_ELSEIF LPAREN expression RPAREN block)*
      (MINT_ELSE block)?
    ;

whileLoop
    : MINT_WHILE LPAREN expression RPAREN block
    ;

simpleAssignment
    : IDENTIFIER ASSIGN expression
    ;

forLoop
    : MINT_FOR LPAREN simpleAssignment SEMI expression SEMI simpleAssignment RPAREN block
    ;
    
breakStatement
    : MINT_BREAK SEMI
    ;

continueStatement
    : MINT_CONTINUE SEMI
    ;

expressionStatement
    : expression SEMI
    ;

block
    : LBRACE statement* RBRACE
    ;

type
    : INT_TYPE
    | FLOAT_TYPE
    | STRING_TYPE
    | BOOL_TYPE
    ;

// =====================
// Expression Parsing by Precedence
// =====================

expression
    : ternaryExpression
    ;

ternaryExpression
    : logicalExpression (T_IF expression T_ELSE expression)?
    ;

logicalExpression
    : logicalExpression AND equalityExpression
    | logicalExpression OR equalityExpression
    | NOT logicalExpression
    | equalityExpression
    ;

equalityExpression
    : comparisonExpression ((EQ | NEQ) comparisonExpression)*
    ;

comparisonExpression
    : additiveExpression ((LT | LTE | GT | GTE) additiveExpression)*
    ;

additiveExpression
    : additiveExpression (ADD | SUB) multiplicativeExpression
    | multiplicativeExpression
    ;

multiplicativeExpression
    : multiplicativeExpression (MUL | DIV | MOD) primaryExpression
    | primaryExpression
    ;

primaryExpression
    : LPAREN expression RPAREN
    | IDENTIFIER
    | NUMBER
    | STRING
    | BOOL
    ;

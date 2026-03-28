grammar MOCP;

// Regra inicial
program : (declaration | principal_func)* EOF ;

// Funções e Blocos
principal_func : VAZIO PRINCIPAL LPAR VAZIO RPAR block ;
block : LBRACE statement* RBRACE ;

// Instruções permitidas
statement 
    : declaration           // declaração: inteiro x;
    | assignment SEMI       // atribuição: x = 10;
    | function_call SEMI    // chamada: escrever(x);
    | return_stmt SEMI      // retorno: retornar 1;
    ;

declaration : tipo ID (EQUALS expr)? SEMI ;
tipo : INTEIRO | REAL | VAZIO ;

assignment : ID EQUALS expr ;
return_stmt : RETORNAR expr ;

function_call 
    : ESCREVERS LPAR STRING RPAR    // escrevers("texto");
    | ESCREVER LPAR expr RPAR       // escrever(x);
    | ID LPAR (expr (COMMA expr)*)? RPAR 
    ;

// Expressões
expr : ID | NUMBER | STRING ;

// TOKENS (Regras em Português)
INTEIRO   : 'inteiro' ;
REAL      : 'real' ;
VAZIO     : 'vazio' ;
PRINCIPAL : 'principal' ;
RETORNAR  : 'retornar' ;
ESCREVER  : 'escrever' ;
ESCREVERS : 'escrevers' ;

// Símbolos
EQUALS : '=' ;
SEMI   : ';' ;
COMMA  : ',' ;
LPAR   : '(' ;
RPAR   : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;

// Tipos de Dados
ID     : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' .*? '"' ; // Esta regra permite aceitar textos entre aspas

WS     : [ \t\r\n]+ -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;
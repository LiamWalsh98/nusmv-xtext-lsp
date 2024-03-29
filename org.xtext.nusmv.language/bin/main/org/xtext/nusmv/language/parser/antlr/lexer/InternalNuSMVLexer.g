/*
 * generated by Xtext 2.21.0
 */
lexer grammar InternalNuSMVLexer;

options {
	backtrack=true;
	memoize=true;
}
tokens {
	COMPASSION;
	SignedWord;
	CONSTANTS;
	FROZENVAR;
	INVARSPEC;
	FAIRNESS;
	Unsigned;
	COMPUTE;
	CTLSPEC;
	JUSTICE;
	LTLSPEC;
	PSLSPEC;
	Boolean;
	Process;
	ASSIGN;
	DEFINE;
	MODULE;
	FALSE;
	INVAR;
	TRANS;
	Array;
	Toint;
	Union;
	Word1;
	INIT;
	IVAR;
	NAME;
	SPEC;
	TRUE;
	Bool;
	Case;
	Esac;
	Init;
	Next;
	Self;
	Word;
	Xnor;
	LessThanSignHyphenMinusGreaterThanSign;
	ABF;
	ABG;
	EBF;
	EBG;
	ISA;
	MAX;
	MIN;
	VAR;
	Mod;
	Xor;
	ExclamationMarkEqualsSign;
	HyphenMinusGreaterThanSign;
	FullStopFullStop;
	ColonColon;
	ColonEqualsSign;
	LessThanSignLessThanSign;
	LessThanSignEqualsSign;
	GreaterThanSignEqualsSign;
	GreaterThanSignGreaterThanSign;
	AF;
	AG;
	AX;
	EF;
	EG;
	EX;
	In;
	Of;
	ExclamationMark;
	Ampersand;
	LeftParenthesis;
	RightParenthesis;
	Asterisk;
	PlusSign;
	Comma;
	HyphenMinus;
	FullStop;
	Solidus;
	Colon;
	Semicolon;
	LessThanSign;
	EqualsSign;
	GreaterThanSign;
	A;
	E;
	F;
	G;
	H;
	O;
	S;
	T;
	U;
	V;
	X;
	Y;
	Z;
	LeftSquareBracket;
	RightSquareBracket;
	LeftCurlyBracket;
	VerticalLine;
	RightCurlyBracket;
	RULE_SL_COMMENT;
	RULE_WORD;
	RULE_ID;
	RULE_INT;
	RULE_WS;
}

@header {
package org.xtext.nusmv.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}
SYNTHETIC_ALL_KEYWORDS :
	(FRAGMENT_COMPASSION)=> FRAGMENT_COMPASSION {$type = COMPASSION; } |
	(FRAGMENT_SignedWord)=> FRAGMENT_SignedWord {$type = SignedWord; } |
	(FRAGMENT_CONSTANTS)=> FRAGMENT_CONSTANTS {$type = CONSTANTS; } |
	(FRAGMENT_FROZENVAR)=> FRAGMENT_FROZENVAR {$type = FROZENVAR; } |
	(FRAGMENT_INVARSPEC)=> FRAGMENT_INVARSPEC {$type = INVARSPEC; } |
	(FRAGMENT_FAIRNESS)=> FRAGMENT_FAIRNESS {$type = FAIRNESS; } |
	(FRAGMENT_Unsigned)=> FRAGMENT_Unsigned {$type = Unsigned; } |
	(FRAGMENT_COMPUTE)=> FRAGMENT_COMPUTE {$type = COMPUTE; } |
	(FRAGMENT_CTLSPEC)=> FRAGMENT_CTLSPEC {$type = CTLSPEC; } |
	(FRAGMENT_JUSTICE)=> FRAGMENT_JUSTICE {$type = JUSTICE; } |
	(FRAGMENT_LTLSPEC)=> FRAGMENT_LTLSPEC {$type = LTLSPEC; } |
	(FRAGMENT_PSLSPEC)=> FRAGMENT_PSLSPEC {$type = PSLSPEC; } |
	(FRAGMENT_Boolean)=> FRAGMENT_Boolean {$type = Boolean; } |
	(FRAGMENT_Process)=> FRAGMENT_Process {$type = Process; } |
	(FRAGMENT_ASSIGN)=> FRAGMENT_ASSIGN {$type = ASSIGN; } |
	(FRAGMENT_DEFINE)=> FRAGMENT_DEFINE {$type = DEFINE; } |
	(FRAGMENT_MODULE)=> FRAGMENT_MODULE {$type = MODULE; } |
	(FRAGMENT_FALSE)=> FRAGMENT_FALSE {$type = FALSE; } |
	(FRAGMENT_INVAR)=> FRAGMENT_INVAR {$type = INVAR; } |
	(FRAGMENT_TRANS)=> FRAGMENT_TRANS {$type = TRANS; } |
	(FRAGMENT_Array)=> FRAGMENT_Array {$type = Array; } |
	(FRAGMENT_Toint)=> FRAGMENT_Toint {$type = Toint; } |
	(FRAGMENT_Union)=> FRAGMENT_Union {$type = Union; } |
	(FRAGMENT_Word1)=> FRAGMENT_Word1 {$type = Word1; } |
	(FRAGMENT_INIT)=> FRAGMENT_INIT {$type = INIT; } |
	(FRAGMENT_IVAR)=> FRAGMENT_IVAR {$type = IVAR; } |
	(FRAGMENT_NAME)=> FRAGMENT_NAME {$type = NAME; } |
	(FRAGMENT_SPEC)=> FRAGMENT_SPEC {$type = SPEC; } |
	(FRAGMENT_TRUE)=> FRAGMENT_TRUE {$type = TRUE; } |
	(FRAGMENT_Bool)=> FRAGMENT_Bool {$type = Bool; } |
	(FRAGMENT_Case)=> FRAGMENT_Case {$type = Case; } |
	(FRAGMENT_Esac)=> FRAGMENT_Esac {$type = Esac; } |
	(FRAGMENT_Init)=> FRAGMENT_Init {$type = Init; } |
	(FRAGMENT_Next)=> FRAGMENT_Next {$type = Next; } |
	(FRAGMENT_Self)=> FRAGMENT_Self {$type = Self; } |
	(FRAGMENT_Word)=> FRAGMENT_Word {$type = Word; } |
	(FRAGMENT_Xnor)=> FRAGMENT_Xnor {$type = Xnor; } |
	(FRAGMENT_LessThanSignHyphenMinusGreaterThanSign)=> FRAGMENT_LessThanSignHyphenMinusGreaterThanSign {$type = LessThanSignHyphenMinusGreaterThanSign; } |
	(FRAGMENT_ABF)=> FRAGMENT_ABF {$type = ABF; } |
	(FRAGMENT_ABG)=> FRAGMENT_ABG {$type = ABG; } |
	(FRAGMENT_EBF)=> FRAGMENT_EBF {$type = EBF; } |
	(FRAGMENT_EBG)=> FRAGMENT_EBG {$type = EBG; } |
	(FRAGMENT_ISA)=> FRAGMENT_ISA {$type = ISA; } |
	(FRAGMENT_MAX)=> FRAGMENT_MAX {$type = MAX; } |
	(FRAGMENT_MIN)=> FRAGMENT_MIN {$type = MIN; } |
	(FRAGMENT_VAR)=> FRAGMENT_VAR {$type = VAR; } |
	(FRAGMENT_Mod)=> FRAGMENT_Mod {$type = Mod; } |
	(FRAGMENT_Xor)=> FRAGMENT_Xor {$type = Xor; } |
	(FRAGMENT_ExclamationMarkEqualsSign)=> FRAGMENT_ExclamationMarkEqualsSign {$type = ExclamationMarkEqualsSign; } |
	(FRAGMENT_HyphenMinusGreaterThanSign)=> FRAGMENT_HyphenMinusGreaterThanSign {$type = HyphenMinusGreaterThanSign; } |
	(FRAGMENT_FullStopFullStop)=> FRAGMENT_FullStopFullStop {$type = FullStopFullStop; } |
	(FRAGMENT_ColonColon)=> FRAGMENT_ColonColon {$type = ColonColon; } |
	(FRAGMENT_ColonEqualsSign)=> FRAGMENT_ColonEqualsSign {$type = ColonEqualsSign; } |
	(FRAGMENT_LessThanSignLessThanSign)=> FRAGMENT_LessThanSignLessThanSign {$type = LessThanSignLessThanSign; } |
	(FRAGMENT_LessThanSignEqualsSign)=> FRAGMENT_LessThanSignEqualsSign {$type = LessThanSignEqualsSign; } |
	(FRAGMENT_GreaterThanSignEqualsSign)=> FRAGMENT_GreaterThanSignEqualsSign {$type = GreaterThanSignEqualsSign; } |
	(FRAGMENT_GreaterThanSignGreaterThanSign)=> FRAGMENT_GreaterThanSignGreaterThanSign {$type = GreaterThanSignGreaterThanSign; } |
	(FRAGMENT_AF)=> FRAGMENT_AF {$type = AF; } |
	(FRAGMENT_AG)=> FRAGMENT_AG {$type = AG; } |
	(FRAGMENT_AX)=> FRAGMENT_AX {$type = AX; } |
	(FRAGMENT_EF)=> FRAGMENT_EF {$type = EF; } |
	(FRAGMENT_EG)=> FRAGMENT_EG {$type = EG; } |
	(FRAGMENT_EX)=> FRAGMENT_EX {$type = EX; } |
	(FRAGMENT_In)=> FRAGMENT_In {$type = In; } |
	(FRAGMENT_Of)=> FRAGMENT_Of {$type = Of; } |
	(FRAGMENT_ExclamationMark)=> FRAGMENT_ExclamationMark {$type = ExclamationMark; } |
	(FRAGMENT_Ampersand)=> FRAGMENT_Ampersand {$type = Ampersand; } |
	(FRAGMENT_LeftParenthesis)=> FRAGMENT_LeftParenthesis {$type = LeftParenthesis; } |
	(FRAGMENT_RightParenthesis)=> FRAGMENT_RightParenthesis {$type = RightParenthesis; } |
	(FRAGMENT_Asterisk)=> FRAGMENT_Asterisk {$type = Asterisk; } |
	(FRAGMENT_PlusSign)=> FRAGMENT_PlusSign {$type = PlusSign; } |
	(FRAGMENT_Comma)=> FRAGMENT_Comma {$type = Comma; } |
	(FRAGMENT_HyphenMinus)=> FRAGMENT_HyphenMinus {$type = HyphenMinus; } |
	(FRAGMENT_FullStop)=> FRAGMENT_FullStop {$type = FullStop; } |
	(FRAGMENT_Solidus)=> FRAGMENT_Solidus {$type = Solidus; } |
	(FRAGMENT_Colon)=> FRAGMENT_Colon {$type = Colon; } |
	(FRAGMENT_Semicolon)=> FRAGMENT_Semicolon {$type = Semicolon; } |
	(FRAGMENT_LessThanSign)=> FRAGMENT_LessThanSign {$type = LessThanSign; } |
	(FRAGMENT_EqualsSign)=> FRAGMENT_EqualsSign {$type = EqualsSign; } |
	(FRAGMENT_GreaterThanSign)=> FRAGMENT_GreaterThanSign {$type = GreaterThanSign; } |
	(FRAGMENT_A)=> FRAGMENT_A {$type = A; } |
	(FRAGMENT_E)=> FRAGMENT_E {$type = E; } |
	(FRAGMENT_F)=> FRAGMENT_F {$type = F; } |
	(FRAGMENT_G)=> FRAGMENT_G {$type = G; } |
	(FRAGMENT_H)=> FRAGMENT_H {$type = H; } |
	(FRAGMENT_O)=> FRAGMENT_O {$type = O; } |
	(FRAGMENT_S)=> FRAGMENT_S {$type = S; } |
	(FRAGMENT_T)=> FRAGMENT_T {$type = T; } |
	(FRAGMENT_U)=> FRAGMENT_U {$type = U; } |
	(FRAGMENT_V)=> FRAGMENT_V {$type = V; } |
	(FRAGMENT_X)=> FRAGMENT_X {$type = X; } |
	(FRAGMENT_Y)=> FRAGMENT_Y {$type = Y; } |
	(FRAGMENT_Z)=> FRAGMENT_Z {$type = Z; } |
	(FRAGMENT_LeftSquareBracket)=> FRAGMENT_LeftSquareBracket {$type = LeftSquareBracket; } |
	(FRAGMENT_RightSquareBracket)=> FRAGMENT_RightSquareBracket {$type = RightSquareBracket; } |
	(FRAGMENT_LeftCurlyBracket)=> FRAGMENT_LeftCurlyBracket {$type = LeftCurlyBracket; } |
	(FRAGMENT_VerticalLine)=> FRAGMENT_VerticalLine {$type = VerticalLine; } |
	(FRAGMENT_RightCurlyBracket)=> FRAGMENT_RightCurlyBracket {$type = RightCurlyBracket; } |
	(FRAGMENT_RULE_SL_COMMENT)=> FRAGMENT_RULE_SL_COMMENT {$type = RULE_SL_COMMENT; } |
	(FRAGMENT_RULE_WORD)=> FRAGMENT_RULE_WORD {$type = RULE_WORD; } |
	(FRAGMENT_RULE_ID)=> FRAGMENT_RULE_ID {$type = RULE_ID; } |
	(FRAGMENT_RULE_INT)=> FRAGMENT_RULE_INT {$type = RULE_INT; } |
	(FRAGMENT_RULE_WS)=> FRAGMENT_RULE_WS {$type = RULE_WS; }
;

fragment FRAGMENT_COMPASSION : 'COMPASSION (';

fragment FRAGMENT_SignedWord : 'signed word';

fragment FRAGMENT_CONSTANTS : 'CONSTANTS';

fragment FRAGMENT_FROZENVAR : 'FROZENVAR';

fragment FRAGMENT_INVARSPEC : 'INVARSPEC';

fragment FRAGMENT_FAIRNESS : 'FAIRNESS';

fragment FRAGMENT_Unsigned : 'unsigned';

fragment FRAGMENT_COMPUTE : 'COMPUTE';

fragment FRAGMENT_CTLSPEC : 'CTLSPEC';

fragment FRAGMENT_JUSTICE : 'JUSTICE';

fragment FRAGMENT_LTLSPEC : 'LTLSPEC';

fragment FRAGMENT_PSLSPEC : 'PSLSPEC';

fragment FRAGMENT_Boolean : 'boolean';

fragment FRAGMENT_Process : 'process';

fragment FRAGMENT_ASSIGN : 'ASSIGN';

fragment FRAGMENT_DEFINE : 'DEFINE';

fragment FRAGMENT_MODULE : 'MODULE';

fragment FRAGMENT_FALSE : 'FALSE';

fragment FRAGMENT_INVAR : 'INVAR';

fragment FRAGMENT_TRANS : 'TRANS';

fragment FRAGMENT_Array : 'array';

fragment FRAGMENT_Toint : 'toint';

fragment FRAGMENT_Union : 'union';

fragment FRAGMENT_Word1 : 'word1';

fragment FRAGMENT_INIT : 'INIT';

fragment FRAGMENT_IVAR : 'IVAR';

fragment FRAGMENT_NAME : 'NAME';

fragment FRAGMENT_SPEC : 'SPEC';

fragment FRAGMENT_TRUE : 'TRUE';

fragment FRAGMENT_Bool : 'bool';

fragment FRAGMENT_Case : 'case';

fragment FRAGMENT_Esac : 'esac';

fragment FRAGMENT_Init : 'init';

fragment FRAGMENT_Next : 'next';

fragment FRAGMENT_Self : 'self';

fragment FRAGMENT_Word : 'word';

fragment FRAGMENT_Xnor : 'xnor';

fragment FRAGMENT_LessThanSignHyphenMinusGreaterThanSign : '<->';

fragment FRAGMENT_ABF : 'ABF';

fragment FRAGMENT_ABG : 'ABG';

fragment FRAGMENT_EBF : 'EBF';

fragment FRAGMENT_EBG : 'EBG';

fragment FRAGMENT_ISA : 'ISA';

fragment FRAGMENT_MAX : 'MAX';

fragment FRAGMENT_MIN : 'MIN';

fragment FRAGMENT_VAR : 'VAR';

fragment FRAGMENT_Mod : 'mod';

fragment FRAGMENT_Xor : 'xor';

fragment FRAGMENT_ExclamationMarkEqualsSign : '!=';

fragment FRAGMENT_HyphenMinusGreaterThanSign : '->';

fragment FRAGMENT_FullStopFullStop : '..';

fragment FRAGMENT_ColonColon : '::';

fragment FRAGMENT_ColonEqualsSign : ':=';

fragment FRAGMENT_LessThanSignLessThanSign : '<<';

fragment FRAGMENT_LessThanSignEqualsSign : '<=';

fragment FRAGMENT_GreaterThanSignEqualsSign : '>=';

fragment FRAGMENT_GreaterThanSignGreaterThanSign : '>>';

fragment FRAGMENT_AF : 'AF';

fragment FRAGMENT_AG : 'AG';

fragment FRAGMENT_AX : 'AX';

fragment FRAGMENT_EF : 'EF';

fragment FRAGMENT_EG : 'EG';

fragment FRAGMENT_EX : 'EX';

fragment FRAGMENT_In : 'in';

fragment FRAGMENT_Of : 'of';

fragment FRAGMENT_ExclamationMark : '!';

fragment FRAGMENT_Ampersand : '&';

fragment FRAGMENT_LeftParenthesis : '(';

fragment FRAGMENT_RightParenthesis : ')';

fragment FRAGMENT_Asterisk : '*';

fragment FRAGMENT_PlusSign : '+';

fragment FRAGMENT_Comma : ',';

fragment FRAGMENT_HyphenMinus : '-';

fragment FRAGMENT_FullStop : '.';

fragment FRAGMENT_Solidus : '/';

fragment FRAGMENT_Colon : ':';

fragment FRAGMENT_Semicolon : ';';

fragment FRAGMENT_LessThanSign : '<';

fragment FRAGMENT_EqualsSign : '=';

fragment FRAGMENT_GreaterThanSign : '>';

fragment FRAGMENT_A : 'A';

fragment FRAGMENT_E : 'E';

fragment FRAGMENT_F : 'F';

fragment FRAGMENT_G : 'G';

fragment FRAGMENT_H : 'H';

fragment FRAGMENT_O : 'O';

fragment FRAGMENT_S : 'S';

fragment FRAGMENT_T : 'T';

fragment FRAGMENT_U : 'U';

fragment FRAGMENT_V : 'V';

fragment FRAGMENT_X : 'X';

fragment FRAGMENT_Y : 'Y';

fragment FRAGMENT_Z : 'Z';

fragment FRAGMENT_LeftSquareBracket : '[';

fragment FRAGMENT_RightSquareBracket : ']';

fragment FRAGMENT_LeftCurlyBracket : '{';

fragment FRAGMENT_VerticalLine : '|';

fragment FRAGMENT_RightCurlyBracket : '}';


// Rules duplicated to allow inter-rule references

fragment RULE_SL_COMMENT : FRAGMENT_RULE_SL_COMMENT;
fragment FRAGMENT_RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_WORD : FRAGMENT_RULE_WORD;
fragment FRAGMENT_RULE_WORD : '0' ('u'|'s')? ('b'|'B'|'o'|'O'|'_'|'d'|'D'|'h'|'H') RULE_INT? '_' ('a'..'f'|'A.' . 'F'|RULE_INT)*;

fragment RULE_ID : FRAGMENT_RULE_ID;
fragment FRAGMENT_RULE_ID : ('A'..'Z'|'a'..'z'|'_') ('A'..'Z'|'a'..'z'|'_'|RULE_INT|'$'|'#'|'-'|'.')*;

fragment RULE_INT : FRAGMENT_RULE_INT;
fragment FRAGMENT_RULE_INT : ('0'..'9')+;

fragment RULE_WS : FRAGMENT_RULE_WS;
fragment FRAGMENT_RULE_WS : (' '|'\t'|'\r'|'\n')+;

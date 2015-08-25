lexer grammar GeneraleLexer;
@members{
private boolean testo = false;
private boolean enterSezione = false;
private boolean enterInfo = false;
private boolean enterCollegamento = false;
private boolean enterTag = false;
private boolean enterCommento = false;
}
tokens {TestoNomeSezione, EnterSezione, ExitSezione, Elenco, EnterInfo , EnterCom}

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua.
//non funziona vedere perchè forze conflitti con tag
EnterCommento	: MINORE ESCLAMATIVO {enterCommento = true; testo = false;}-> type( EnterCom ) ;
TestoCommento	: {enterCommento}? ~[>]+;
ChiusuraCommento	:	{enterCommento}? MAGGIORE{enterCommento = false; testo=true;};

//Come è formata l'informazione
EnterInformazione	:	GRAFFAAPERTA GRAFFAAPERTA {enterInfo = true; testo = false;} -> type( EnterInfo ) ;
ExitInfo	:	{enterInfo}? GRAFFACHIUSA GRAFFACHIUSA {enterInfo = false; testo = true; } ;
TestoInformazione	:	{enterInfo}?  ~[}|]+ ;
SkipInformazione	:	{enterInfo}? '|' -> skip ;

//Come è formato il collegamento
EnterCollegamento	:	QUADRAAPERTA QUADRAAPERTA {enterCollegamento = true; testo = false;} ;
ExitCollegamento	:	QUADRACHIUSA QUADRACHIUSA {enterCollegamento = false; testo = true;} ;
CollegamentoImage	:	{enterCollegamento}? ('image' | 'File') ;
//ho aggiunto [
CollegamentoTestoGenerico	: {enterCollegamento}? ~[\][:|]+ ;
SkipCollegamento	:	{enterCollegamento}? ( DUEPUNTI | BARRAVERTICALE ) -> skip;

//Come sono formati gli elenchi cancellato newline pare una stupidaggine ho levato elenco
Elenco	:	ElencoNumerico | ElencoPuntato | ElencoVuoto ;
fragment ElencoNumerico	:	DUEPUNTI* ASTERISCO+ DUEPUNTI? ;
fragment ElencoPuntato	:   DUEPUNTI* CANCELLETTO+ DUEPUNTI? ; 
fragment ElencoVuoto	:	DUEPUNTI+ ; 
//fragment ElencoPersonalizzato	: PUNTOVIRGOLA TestoElencoPersonalizzato DUEPUNTI ;
fragment TestoElencoPersonalizzato	: ~[:]+ ;

//come è formato un Tag
ApertoTag : MINORE Id MAGGIORE{enterTag=true;testo=true;} ;
ChiusoTag : {enterTag}? MINORE BARRATAG ID MAGGIORE{testo=false;};

SPAZIO : ' ';
SEA_WS	:	('\t'|'\r'? '\n') ;
Text	:	{testo}? ~('='|'{'|'['|'#'|'<'|']'|'\n')+ ;

//ho cancellato spazio



Id : ID (S? ID? DUEPUNTI? Assegnazione)*
   ;
S :	[ \t\r\n] -> channel(HIDDEN);
Assegnazione : ID UGUALE STRING;
ID	:	[A-Za-z0-9]+;

fragment ESCLAMATIVO : 	'!';
fragment STRING : '"' ~[<"]* '"'
			| '\'' ~[<']* '\'';
fragment MINORE : '<' ;
fragment MAGGIORE: '>';
fragment BARRATAG: '/' ;
fragment UGUALE	:	'=' ;
fragment GRAFFAAPERTA	:	'{' ;
fragment GRAFFACHIUSA	:	'}' ;
fragment QUADRAAPERTA	:	'[' ;
fragment QUADRACHIUSA	:	']' ;
fragment TRATTINO	:	'-' ;
fragment DUEPUNTI	:	':' ;
fragment BARRAVERTICALE	:	'|' ;
fragment CANCELLETTO	:	'#' ;
fragment ASTERISCO	:	'*' ;
fragment PUNTOVIRGOLA	:	';' ;

lexer grammar GeneraleLexer;
@lexer::members{
private boolean testo = false;
private boolean enterSezione = false;
private boolean enterInfo = false;
private boolean enterCollegamento = false;
private boolean enterTag = false;
}
tokens {TestoNomeSezione, EnterSezione, ExitSezione, Elenco, EnterInfo}

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua.


//Come è formata l'informazione
EnterInformazione	:	GRAFFAAPERTA GRAFFAAPERTA {enterInfo = true; testo = false;} -> type( EnterInfo ) ;
ExitInfo	:	{enterInfo}? GRAFFACHIUSA GRAFFACHIUSA {enterInfo = false; testo = true; } ;
TestoInformazione	:	{enterInfo}?  ~[}|]+ ;
SkipInformazione	:	{enterInfo}? '|' -> skip ;

//Come è formato il collegamento
EnterCollegamento	:	QUADRAAPERTA QUADRAAPERTA {enterCollegamento = true; testo = false;} ;
ExitCollegamento	:	{enterCollegamento}? QUADRACHIUSA QUADRACHIUSA {enterCollegamento = false; testo = true;} ;
CollegamentoImage	:	{enterCollegamento}? ('image' | 'File') ;
CollegamentoTestoGenerico	: {enterCollegamento}? ~[\]:|]+ ;
SkipCollegamento	:	{enterCollegamento}? ( DUEPUNTI | BARRAVERTICALE ) -> skip;

//Come sono formati gli elenchi
Elenco	:	ElencoNumerico | ElencoPersonalizzato | ElencoPuntato | ElencoVuoto ;
fragment ElencoNumerico	:	NEWLINE DUEPUNTI* ASTERISCO+ DUEPUNTI? ;
fragment ElencoPuntato	:	NEWLINE DUEPUNTI* CANCELLETTO+ DUEPUNTI? ; 
fragment ElencoVuoto	:	NEWLINE DUEPUNTI+ ; 
fragment ElencoPersonalizzato	:	NEWLINE PUNTOVIRGOLA TestoElencoPersonalizzato DUEPUNTI ;
fragment TestoElencoPersonalizzato	: ~[:]+ ;

//come è formato un Tag
ApertoTag : MINORE Id MAGGIORE{enterTag=true;testo=true;} ;
ChiusoTag : {enterTag}? MINORE BARRATAG ID MAGGIORE{testo=false;};

NEWLINE	:	'\r'? '\n' ;
Text	:	{testo}? ~[={[\r\n<]+ ;



Id : ID (S? ID? DUEPUNTI? Assegnazione)*
   ;
S :	[ \t\r\n] -> channel(HIDDEN);
Assegnazione : ID UGUALE STRING;
ID	:	[A-Za-z0-9]+;


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

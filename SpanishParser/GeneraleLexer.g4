lexer grammar GeneraleLexer;
@lexer::members{
protected boolean testo = false;
protected boolean enterSezione = false;
protected boolean enterInfo = false;
protected boolean enterCollegamento = false;
}
tokens {TestoNomeSezione, EnterSezione, ExitSezione, EnterInfo}

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua.

//Come è formata l'informazione
EnterInformazione	:	GRAFFAAPERTA GRAFFAAPERTA {enterInfo = true; testo = false;} -> type( EnterInfo ) ;
ExitInfo	:	{enterInfo}? GRAFFACHIUSA GRAFFACHIUSA {enterInfo = false; testo = true; } ;
TestoInformazione	:	{enterInfo}?  ~[|:}]+ ;
SkipInformazione	:	{enterInfo}? [|:] -> skip ;

//Come è formato il collegamento
EnterCollegamento	:	QUADRAAPERTA QUADRAAPERTA {enterCollegamento = true; testo = false;} ;
ExitCollegamento	:	{enterCollegamento}? QUADRACHIUSA QUADRACHIUSA {enterCollegamento = false; testo = true;} ;
CollegamentoImage	:	{enterCollegamento}? ('image' | 'File') ;
CollegamentoTestoGenerico	: {enterCollegamento}? (~[\]:|[]+
							|	(QUADRAAPERTA CollegamentoTestoGenerico QUADRACHIUSA {_input.LA(1) != ']' || (_input.LA(1) == ']' && _input.LA(2) == ']')}?)
							|	(QUADRAAPERTA CollegamentoTestoGenerico)
							);
SkipCollegamento	:	{enterCollegamento}? ( DUEPUNTI | BARRAVERTICALE ) -> skip;

//Grassetto
Grassetto	:	APOSTROFO APOSTROFO APOSTROFO ;
Corsivo	:	APOSTROFO APOSTROFO ;
CorsivoGrassetto	:	APOSTROFO APOSTROFO APOSTROFO APOSTROFO ;


//Gestione commenti <!-- testo -->
Commento	:	'<!--' CommentoTesto* '-->' -> skip;
fragment CommentoTesto	:	~[-]+
						|	'-' ~[-];

//Come sono formati gli elenchi
Elenco	:	ElencoNumerico | ElencoPersonalizzato | ElencoPuntato | ElencoVuoto ;
fragment ElencoNumerico	:	NEWLINE DUEPUNTI* ASTERISCO+ DUEPUNTI? ;
fragment ElencoPuntato	:	NEWLINE DUEPUNTI* CANCELLETTO+ DUEPUNTI? ; 
fragment ElencoPersonalizzato	:	NEWLINE DUEPUNTI* PUNTOVIRGOLA TestoElencoPersonalizzato DUEPUNTI ;
fragment ElencoVuoto	:	NEWLINE DUEPUNTI+ ; 
fragment TestoElencoPersonalizzato	: ~[:]+ ;

NEWLINE	:	'\r'? '\n' ;
Text	:	{testo}? ( ~[={[\r\n'<]+ 
		|	(QUADRAAPERTA ~[[] Text )
		|	(APOSTROFO  ~['] Text )
		|	(GRAFFAAPERTA ~[{] Text )
		|	(APOSTROFO ~['] Text)
		|	('<' ~[!\r?\n]? Text?)
		|	({_input.LA(-1)!='\n'}? UGUALE Text? )
		);

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
fragment APOSTROFO	:	'\'';

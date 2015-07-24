lexer grammar GeneraleLexer2;
@lexer::members{
private boolean testo = false;
private boolean enterSezione = false;
private boolean enterInfo = false;
}
tokens {TestoNomeSezione, EnterSezione, ExitSezione, Elenco, EnterInfo}

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua.
EnterSezioneT	:	UGUALE UGUALE UGUALE {enterSezione = true; } -> type( EnterSezione );
ExitSezioneT	:	{enterSezione}? UGUALE UGUALE UGUALE NEWLINE {enterSezione = false; testo = true;}-> type( ExitSezione );
TestoSezione	:	{enterSezione}? ~[=]+ -> type (TestoNomeSezione) ;

//Come è formata l'informazione
EnterInformazione	:	GRAFFAAPERTA GRAFFAAPERTA {enterInfo = true; testo = false;} -> type( EnterInfo ) ;
ExitInfo	:	{enterInfo}? GRAFFACHIUSA GRAFFACHIUSA {enterInfo = false; testo = true; } ;
TestoInformazione	:	{enterInfo}?  ~[}]+ ;


Text	:	{testo}? ~[={]+ ;

fragment UGUALE	:	'=' ;
fragment NEWLINE	:	'\r'? '\n' ;
fragment GRAFFAAPERTA	:	'{' ;
fragment GRAFFACHIUSA	:	'}' ;

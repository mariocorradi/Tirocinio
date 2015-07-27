lexer grammar SpanishLexer;
//options {superClass=GeneraleLexer;}
tokens{SezioneSpecifica}
import GeneraleLexer;
EnterSezioneT	:	'===' {enterSezione = true; testo = false;} -> type( EnterSezione );
ExitSezioneT	:	{enterSezione}? UGUALE UGUALE UGUALE NEWLINE {enterSezione = false; testo = true;} -> type( ExitSezione ) ;
Etimologia	:	{enterSezione}? 'Etimologia' -> type(SezioneSpecifica);
TestoSezione	:	{enterSezione}? ~[=]+ -> type (TestoNomeSezione) ;

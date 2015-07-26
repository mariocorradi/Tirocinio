lexer grammar SpanishLexer;
//options {superClass=GeneraleLexer;}
import GeneraleLexer;
EnterSezioneT	:	'===' {enterSezione = true; testo = false;} -> type( EnterSezione );
ExitSezioneT	:	{enterSezione}? UGUALE UGUALE UGUALE NEWLINE {enterSezione = false; testo = true;} -> type( ExitSezione ) ;
TestoSezione	:	{enterSezione}? ~[=]+ -> type (TestoNomeSezione) ;

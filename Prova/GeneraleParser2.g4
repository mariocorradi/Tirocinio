parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

elemento : contenuto+;
contenuto	:	(tag |testo | informazione | collegamento | elenco)+ ;
tag : ApertoTag NEWLINE? (contenuto)* ChiusoTag NEWLINE?;
informazione	:	EnterInfo TestoInformazione+ ExitInfo ;
collegamento	:	EnterCollegamento image? CollegamentoTestoGenerico+ ExitCollegamento ;
image	:	CollegamentoImage ;
testo	:	(Text | NEWLINE) ;
elenco	:	Elenco ( informazione | Text | collegamento)*;

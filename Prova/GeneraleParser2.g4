parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

contenuto	:	(testo | informazione | collegamento | elenco)+ ;
informazione	:	EnterInfo TestoInformazione+ ExitInfo ;
collegamento	:	EnterCollegamento image? CollegamentoTestoGenerico+ ExitCollegamento ;
image	:	CollegamentoImage ;
testo	:	(Text | NEWLINE) ;
elenco	:	Elenco ( informazione | Text | collegamento)*;

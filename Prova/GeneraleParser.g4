parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

prova : ApertoTag ChiusoTag;
contenuto	:	(tag |testo | informazione | collegamento | elenco | commento)+ ;
tag : ApertoTag NEWLINE? (contenuto)* ChiusoTag NEWLINE?;
informazione	:	EnterInfo TestoInformazione+ ExitInfo ;
collegamento	:	EnterCollegamento image? CollegamentoTestoGenerico+ ((collegamento) (Text|SPAZIO)?)* ExitCollegamento ;
commento :	EnterCom TestoCommento+ ChiusuraCommento ;
image	:	CollegamentoImage ;
testo	:	(Text | SEA_WS) ;
// ho aggiunto spazio esclusivamente gli errori input co spazio
elenco	:	Elenco ( informazione | Text | SPAZIO | collegamento)* SEA_WS;

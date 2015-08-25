parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

contenuto	:	(testo | informazione | collegamento | elenco | grassetto | corsivo | corsivoGrassetto)+ ;
informazione	:	EnterInfo TestoInformazione+ ExitInfo ;
collegamento	:	EnterCollegamento image? CollegamentoTestoGenerico+ ExitCollegamento ;
image	:	CollegamentoImage ;
testo	:	Text | NEWLINE;
elenco	:	Elenco ( informazione | testo | collegamento | grassetto | corsivo | corsivoGrassetto)* (NEWLINE | EOF)?;
grassetto	:	Grassetto (testo | informazione | collegamento)+ Grassetto;
corsivo	:	Corsivo (testo | informazione | collegamento)+ Corsivo;
corsivoGrassetto :	CorsivoGrassetto (testo | informazione | collegamento)+ CorsivoGrassetto;

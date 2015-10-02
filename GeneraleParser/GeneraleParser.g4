parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

contenutoWithText	:	contenuto | elenco | testo;
contenuto	:	(informazione | collegamento | corsivo | grassetto | corsivoOrGrassetto) ;

informazione	:	EnterInfo (TestoInformazione | contenuto | elenco)+ ExitInfo ;

collegamento	:	EnterCollegamento ( (image (contenutoCollegamento | collegamento)+ ) | contenutoCollegamento+ ) ExitCollegamento ;
contenutoCollegamento	:	testoCollegamento | skipCollegamento | contenuto;
testoCollegamento	:	CollegamentoTestoGenerico;
skipCollegamento	:	SkipCollegamento ;
image	:	CollegamentoImage ;

elenco	:	Elenco ( contenuto | testoElenco | TestoInformazione)* (NEWLINE | EOF);
testoElenco	:	Text ;

corsivo	:	Corsivo ;
grassetto	: Grassetto ;
corsivoOrGrassetto	:	CorsivoOrGrassetto ;

testo	:	Text | NEWLINE ;

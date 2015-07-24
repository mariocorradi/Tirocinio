parser grammar GeneraleParser;
options { tokenVocab=GeneraleLexer; }

page	:	sezione+;
sezione	:	EnterSezione TestoNomeSezione ExitSezione contenuto ;
contenuto	:	( Text | elenco | informazione | collegamento )* ;
informazione	:	EnterInfo TestoInfo (SaltaInfo TestoInfo)* ExitInfo ;
elenco	:	Elenco ( informazione | Text | collegamento)* (NEWLINE | EOF)?;
collegamento	:	EnterCollegamento TestoCollegamento (SaltaCollegamento TestoCollegamento)* ExitCollegamento;

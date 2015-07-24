parser grammar GeneraleParser2;
options { tokenVocab=GeneraleLexer; }

page	:	sezione+;
sezione	:	EnterSezione TestoNomeSezione ExitSezione contenuto;
contenuto	:	(Text | informazione)+ ;
informazione	:	EnterInfo TestoInformazione ExitInfo ;


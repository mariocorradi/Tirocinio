grammar Tirocinio;

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua

//Gestione delle info, ciò che c'è tra quattro parantesi graffe {{ ... }}
Enter	:	GRAFFA GRAFFA  ;
Exit	:	GRAFFACHI GRAFFACHI NEWLINE; 
TestoInfo	:	~[BARRAVERTICALE GRAFFACHI]+ ;  
SaltaInfo	:	BARRAVERTICALE -> channel(HIDDEN) ;

//Gestione dei collegamento, ciò che c'è tr quattro parantesi quadre [[ ... ]]
EnterCollegamento	:	QUADRAAP QUADRAAP; 
TestoCollegamento	:	~[BARRAVERTICALE DUEPUNTI QUADRACHI]+ ; // qui starei attendo perchè si può confodere con File: 
SaltaCollegamento	:	(BARRAVERTICALE | DUEPUNTI) -> channel(HIDDEN) ;
ExitCollegamento	:	QUADRACHI QUADRACHI ;

SEA_WS	:	[ \t]+ -> skip ;
// in text potrebbe essere utile per file image [File : asdmakd.jpg|right|..] prendere fino a BARRAVERTICALE O CHIUSAQUADRA
Text	:	~[UGUALE GRAFFAAP APOSTROFO QUADRAAP NEWLINE]+ 
		|	APOSTROFO ~[APOSTROFO] Text 
		|	QUADRAAP ~[QUADRAAP] Text
		|	UGUALE Text
		|	GRAFFAAP Text
		;
		
ElencoPuntato	:	NEWLINE DUEPUNTI* ASTERISCO+ DUEPUNTI?  ;
ElencoNumerico	:	NEWLINE DUEPUNTI* CANCELLETTO+ DUEPUNTI?  ;
ElencoPersonale	:	NEWLINE DUEPUNTI* PUNTOVIRGOLA TestoElencoPersonale DUEPUNTI  ;
fragment TestoElencoPersonale	:	~[DUEPUNTI]+ ;  // se nel testo ci fosse un due punti ? 
ElencoPulito	:	NEWLINE DUEPUNTI+   ;


//Questo file contiene un elenco di simboli da utilizzare nel lexer.
//I simboli sono uguali in tutte le lingue, cambia come vengono utilizzati.

NEWLINE	:	'\r'? '\n' ;

fragment IMAGE	:	'File'|
			'Image';
fragment UGUALE	:	'=' ;
GRAFFAAP	:	'{{' ;
GRAFFA : '{' ;
GRAFFACHI	: '}' ;
fragment QUADRAAP	:	'[' ;
fragment QUADRACHI	:	']' ;
fragment APOSTROFO	:	'\'' ;
fragment CANCELLETTO	:	'#' ;
fragment ASTERISCO	:	'*' ;
fragment DUEPUNTI	:	':' ;
fragment PUNTOVIRGOLA	:	';' ;
fragment TRATTINO	:	'-' ;
fragment BARRAVERTICALE	:	'|' ;

informazione	:	Enter exit;
exit : Exit;

lexer grammar GeneraleLexer;
@header{
import java.util.ArrayList;
import java.lang.Math;
}
@lexer::members{
protected final int enterSezione = 1;
protected final int enterInfo = 2;
protected final int enterCollegamento = 3;
protected final int enterElenco = 4;
protected static ArrayList<Integer> lista = new ArrayList<Integer>();

protected void add(int i){
	lista.add(i);
}

protected void remove(){
	if(lista.size() > 0)
		lista.remove(lista.size() - 1 );
}

protected void remove(int i){
	if(lista.size() > 0 && isPresent(i))
		lista.remove(lista.indexOf(i));
}

protected boolean isIt(int i){
	if(lista.size() == 0)
		return false;
	return lista.get(lista.size() - 1) == i;
}

protected boolean isPresent(int i){
	if(lista.size() == 0)
		return false;
	int index = lista.indexOf(i);
	return index != -1;
}

public static void stamp(String text){
	int k = 0;
	System.out.println(text);
	for(Integer i : lista){
		System.out.println(k+") " + i);
		k++;
	}
	System.out.println("\n\n\n\n----------------");
}

}

//Come è formata una sezione viene tralasciata perchè varia da lingua a lingua.

//Come è formata l'informazione
EnterInfo	:	GRAFFAAPERTA GRAFFAAPERTA {add(enterInfo);} ;
ExitInfo	:	{isIt(enterInfo)}? GRAFFACHIUSA GRAFFACHIUSA {remove();} ;
TestoInformazione	:	{isIt(enterInfo)}?  (
												~[|:}[{]+ 
											|	QUADRAAPERTA
											|	GRAFFACHIUSA
											);
SkipInformazione	:	{isIt(enterInfo)}? [|:] -> skip;

//Come è formato il collegamento
EnterCollegamento	:	QUADRAAPERTA QUADRAAPERTA {add(enterCollegamento);} ;
ExitCollegamento	:	{isIt(enterCollegamento)}? QUADRACHIUSA QUADRACHIUSA {remove();} ;
CollegamentoImage	:	{isIt(enterCollegamento)}? IMAGE;
CollegamentoTestoGenerico	: {isIt(enterCollegamento)}? (~[\]:|[']+
							|	(QUADRAAPERTA ~[[] CollegamentoTestoGenerico? QUADRACHIUSA? {_input.LA(1) != ']' | 	(_input.LA(1) == ']' && _input.LA(2) == ']')}?)
							|	(APOSTROFO)
							);
SkipCollegamento	:	{isIt(enterCollegamento)}? ( DUEPUNTI | BARRAVERTICALE );

//Grassetto / Corsivo / Corsivo e Grassetto
Corsivo	:	APOSTROFO APOSTROFO  ;
Grassetto	:	Corsivo APOSTROFO ;
CorsivoOrGrassetto	:	Grassetto APOSTROFO ; 

//Gestione commenti <!-- testo -->
Commento	:	'<!--' CommentoTesto* '-->' -> skip;
fragment CommentoTesto	:	~[-]+
						|	'-' ~[-];

//Come sono formati gli elenchi
Elenco	:	{_input.LA(-1) == '\n'}? (ElencoNumerico | ElencoPersonalizzato | ElencoPuntato | ElencoVuoto) {add(enterElenco);};
fragment ElencoPuntato	:	DUEPUNTI* ASTERISCO+ DUEPUNTI? ;
fragment ElencoNumerico	:	DUEPUNTI* CANCELLETTO+ DUEPUNTI? ; 
fragment ElencoPersonalizzato	:	DUEPUNTI* PUNTOVIRGOLA TestoElencoPersonalizzato DUEPUNTI ;
fragment ElencoVuoto	:	DUEPUNTI+ ; 
fragment TestoElencoPersonalizzato	: ~[:]+ ;

NEWLINE	:	'\r'? '\n' {if(isIt(enterElenco)) remove();};
Text	:	{!isIt(enterInfo) && !isIt(enterCollegamento) && !isIt(enterSezione)}? 
		(	 ~[={[\r\n'<}#:*]+
		|	(QUADRAAPERTA ~[[] Text )
		|	(APOSTROFO)
		|	(GRAFFAAPERTA ~[{] Text )
		|	('<' ~[!\r?\n]? Text?)
		|	( UGUALE ~[={[\r\n'<]* )
		|	(GRAFFACHIUSA)
		|	CANCELLETTO
		|	DUEPUNTI
		|	ASTERISCO
		)
		;

fragment UGUALE	:	'=' ;
fragment GRAFFAAPERTA	:	'{' ;
fragment GRAFFACHIUSA	:	'}' ;
fragment QUADRAAPERTA	:	'[' ;
fragment QUADRACHIUSA	:	']' ;
fragment TRATTINO	:	'-' ;
fragment DUEPUNTI	:	':' ;
fragment BARRAVERTICALE	:	'|' ;
fragment CANCELLETTO	:	'#' ;
fragment ASTERISCO	:	'*' ;
fragment PUNTOVIRGOLA	:	';' ;
fragment APOSTROFO	:	'\'';
fragment IMAGE	:	('image' | 'File' | 'Imagen' | 'Image' | 'Fichier') DUEPUNTI;

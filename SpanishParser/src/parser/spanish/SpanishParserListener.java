package parser.spanish;

// Generated from GeneraleParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

import parser.general.GeneraleParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeneraleParser}.
 */
public interface SpanishParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(SpanishParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(SpanishParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#sezione}.
	 * @param ctx the parse tree
	 */
	void enterSezione(SpanishParser.SezioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#sezione}.
	 * @param ctx the parse tree
	 */
	void exitSezione(SpanishParser.SezioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#contenuto}.
	 * @param ctx the parse tree
	 */
	void enterContenuto(GeneraleParser.ContenutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#contenuto}.
	 * @param ctx the parse tree
	 */
	void exitContenuto(GeneraleParser.ContenutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#informazione}.
	 * @param ctx the parse tree
	 */
	void enterInformazione(GeneraleParser.InformazioneContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#informazione}.
	 * @param ctx the parse tree
	 */
	void exitInformazione(GeneraleParser.InformazioneContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#collegamento}.
	 * @param ctx the parse tree
	 */
	void enterCollegamento(GeneraleParser.CollegamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#collegamento}.
	 * @param ctx the parse tree
	 */
	void exitCollegamento(GeneraleParser.CollegamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(GeneraleParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(GeneraleParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#testo}.
	 * @param ctx the parse tree
	 */
	void enterTesto(GeneraleParser.TestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#testo}.
	 * @param ctx the parse tree
	 */
	void exitTesto(GeneraleParser.TestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#elenco}.
	 * @param ctx the parse tree
	 */
	void enterElenco(GeneraleParser.ElencoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#elenco}.
	 * @param ctx the parse tree
	 */
	void exitElenco(GeneraleParser.ElencoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#grassetto}.
	 * @param ctx the parse tree
	 */
	void enterGrassetto(GeneraleParser.GrassettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#grassetto}.
	 * @param ctx the parse tree
	 */
	void exitGrassetto(GeneraleParser.GrassettoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#corsivo}.
	 * @param ctx the parse tree
	 */
	void enterCorsivo(GeneraleParser.CorsivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#corsivo}.
	 * @param ctx the parse tree
	 */
	void exitCorsivo(GeneraleParser.CorsivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneraleParser#corsivoGrassetto}.
	 * @param ctx the parse tree
	 */
	void enterCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneraleParser#corsivoGrassetto}.
	 * @param ctx the parse tree
	 */
	void exitCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx);
}

package parser.general;

// Generated from GeneraleParser.g4 by ANTLR 4.5.1

import java.util.List;

import objects.Elenco;
import objects.LanguageFunctions;
import objects.output.Output;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import enums.OutputVariableNames;
import gestioneLingua.Language;

public class GeneraleParserBaseListener implements GeneraleParserListener {
	
	protected boolean findImage = false;
	protected GeneraleParser parser = null;
	protected Output output = null;
	protected OutputVariableNames lastSectionName;
	protected boolean enterElenco = false;
	protected Language language;
	protected Elenco elenco;
	
	@Override public void enterContenuto(GeneraleParser.ContenutoContext ctx) { }
	
	@Override public void exitContenuto(GeneraleParser.ContenutoContext ctx) { }
	
	@Override public void enterInformazione(GeneraleParser.InformazioneContext ctx) { }
	
	@Override public void exitInformazione(GeneraleParser.InformazioneContext ctx) { }

	@Override public void enterCollegamento(GeneraleParser.CollegamentoContext ctx) {}
	
	@Override public void exitCollegamento(GeneraleParser.CollegamentoContext ctx) { 	
		if(findImage){
			try {
				String url = ctx.getToken(LanguageFunctions.getRealParserValue(parser, "CollegamentoTestoGenerico"), 0).getText();
				output.concanateArray("Images", url);
				findImage = false;
			} catch (NoSuchFieldException | SecurityException
					| IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} else if(enterElenco){
			try {
				List<TerminalNode> list = ctx.getTokens(LanguageFunctions.getRealParserValue(parser, "CollegamentoTestoGenerico"));
				for(TerminalNode tn : list)
					elenco.addText(tn.getText());
			} catch (NoSuchFieldException | SecurityException
					| IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} else if(lastSectionName != null && language.needTesto(lastSectionName)){
			
		}	
	}

	@Override public void enterImage(GeneraleParser.ImageContext ctx) { findImage = true;  }

	@Override public void exitImage(GeneraleParser.ImageContext ctx) { }

	@Override public void enterTesto(GeneraleParser.TestoContext ctx) { }

	@Override public void exitTesto(GeneraleParser.TestoContext ctx) {
		if(enterElenco){
			elenco.addText(ctx.getText());
		} else if(lastSectionName != null && language.needTesto(lastSectionName)){
			output.concanateValue(lastSectionName.toString(), ctx.getText());
		}	
	}

	@Override public void enterElenco(GeneraleParser.ElencoContext ctx) {enterElenco = true; }

	@Override public void exitElenco(GeneraleParser.ElencoContext ctx) {enterElenco = false; }

	@Override public void enterGrassetto(GeneraleParser.GrassettoContext ctx) { }

	@Override public void exitGrassetto(GeneraleParser.GrassettoContext ctx) { }

	@Override public void enterCorsivo(GeneraleParser.CorsivoContext ctx) { }
	
	@Override public void exitCorsivo(GeneraleParser.CorsivoContext ctx) { }

	@Override public void enterCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx) { }

	@Override public void exitCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
	
}

package parser.general;

// Generated from GeneraleParser.g4 by ANTLR 4.5.1

import java.util.List;

import objects.Elenco;
import objects.LanguageFunctions;
import objects.output.Output;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import eccezione.OutputChiaveNonValida;
import eccezione.OutputKeyAlreadyExist;
import eccezione.OutputValueIsNull;
import enums.OutputVariableNames;
import enums.SezioneElenco;
import gestioneLingua.ExtraSection;
import gestioneLingua.Language;

public class GeneraleParserBaseListener implements GeneraleParserListener {
	
	protected boolean findImage = false, enterElenco = false, grassetto = false;
	protected GeneraleParser parser = null;
	protected Output output = null;
	protected OutputVariableNames lastSectionName;
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
				output.concanateArray(url, OutputVariableNames.Images.toString());
				findImage = false;
			} catch (NoSuchFieldException | SecurityException
					| IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} else if(lastSectionName != null){
			if(enterElenco){
				try {
					List<TerminalNode> list = ctx.getTokens(LanguageFunctions.getRealParserValue(parser, "CollegamentoTestoGenerico"));
					String text = "";
					for(TerminalNode tn : list)
						text += tn.getText();
					elenco.addText(text);
					if(grassetto && lastSectionName.hasBold()){
						gestGrassetto(text);
					}
				} catch (NoSuchFieldException | SecurityException
						| IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} else if(lastSectionName != null && language.needTesto(lastSectionName)){
				if(grassetto && lastSectionName.hasBold()){
//					gestGrassetto(text);
				}
			}	
		}
	}

	@Override public void enterImage(GeneraleParser.ImageContext ctx) { findImage = true;  }

	@Override public void exitImage(GeneraleParser.ImageContext ctx) { }

	@Override public void enterTesto(GeneraleParser.TestoContext ctx) { }

	@Override public void exitTesto(GeneraleParser.TestoContext ctx) {
//		System.out.println("Testo: " + ctx.getText());
		if(language.hasSezioneExtra() && language.getSezioneExtra().hasAdditionalText()){
			language.getSezioneExtra().addText(ctx.getText(), ExtraSection.STRING);
		}else if(lastSectionName != null){
			if(enterElenco){
				elenco.addText(ctx.getText());
				if(grassetto)
					gestGrassetto(ctx.getText());
			} else if(lastSectionName != null && language.needTesto(lastSectionName)){
				try {
					output.addValue(true, "", ctx.getText(), lastSectionName);
					if(grassetto)
						gestGrassetto(ctx.getText());
				} catch (OutputChiaveNonValida | OutputValueIsNull
						| OutputKeyAlreadyExist e) {
					e.printStackTrace();
				}
			}	
		}
	}

	@Override public void enterElenco(GeneraleParser.ElencoContext ctx) {enterElenco = true; }

	@Override public void exitElenco(GeneraleParser.ElencoContext ctx) {enterElenco = false; }

	@Override public void enterGrassetto(GeneraleParser.GrassettoContext ctx) {grassetto = true; }

	@Override public void exitGrassetto(GeneraleParser.GrassettoContext ctx) { 
		grassetto = false;
		if(grassettoValue != null){
			if(enterElenco){
				elenco.addBold(grassettoValue);
			} else {
				output.concanateArray(grassettoValue, lastSectionName.toString(), OutputVariableNames.Bold.toString());
			}
			grassettoValue = null;
		}
	}

	@Override public void enterCorsivo(GeneraleParser.CorsivoContext ctx) { }
	
	@Override public void exitCorsivo(GeneraleParser.CorsivoContext ctx) { }

	@Override public void enterCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx) { }

	@Override public void exitCorsivoGrassetto(GeneraleParser.CorsivoGrassettoContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
	
	
	private String grassettoValue = null;
	protected void gestGrassetto(String text){
		if(grassettoValue == null)
			grassettoValue = text;
		else
			grassettoValue += text;
	}
	
}

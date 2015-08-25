package walker;

import eccezione.OutputChiaveNonValida;
import eccezione.OutputKeyAlreadyExist;
import eccezione.OutputValueIsNull;
import enums.OutputVariableNames;
import gestioneLingua.ExtraSection;
import gestioneLingua.lingue.spanish.Spanish;

import java.util.List;

import objects.Elenco;
import objects.output.Output;

import org.antlr.v4.runtime.tree.TerminalNode;

import parser.general.GeneraleParser.ElencoContext;
import parser.general.GeneraleParser.InformazioneContext;
import parser.general.GeneraleParser.TestoContext;
import parser.spanish.SpanishParser;
import parser.spanish.SpanishParser.SezioneContext;
import parser.spanish.SpanishParserBaseListener;

public class SpanishWalker extends SpanishParserBaseListener{
	
	private static final String 
		INFO_TRADUZIONE = "t|t\\+", INFO_LINK = "ucf";
	
	public SpanishWalker(Spanish language, SpanishParser parser, Output output){
		this.language = language;
		this.parser = parser;
		this.output = output;
	}

	
	
	@Override
	public void enterSezione(SezioneContext ctx) {
		String nomeSezione = ctx.getToken(SpanishParser.TestoNomeSezione, 0).getText();
		lastSectionName = language.getSectionKey(nomeSezione);
		if(lastSectionName == null && language.sezioniExtra(nomeSezione)){
			ExtraSection e = ((Spanish) language).getSezioneExtra();
			e.addSection(ctx);
			if(e.getSectionName() == OutputVariableNames.Type){
				lastSectionName = OutputVariableNames.Definition;
			}
			try {
				output.addValue(false, null, e.output(), e.getSectionName());
			} catch (OutputChiaveNonValida | OutputValueIsNull | OutputKeyAlreadyExist a) {
				a.printStackTrace();
			}
		}
	}
	
	@Override
	public void exitSezione(SezioneContext ctx) {
		if(lastSectionName != null && elenco != null){
			try {
				output.addValue(false, null, elenco.getElenco(), lastSectionName);
			} catch (OutputChiaveNonValida | OutputValueIsNull
					| OutputKeyAlreadyExist e) {
				e.printStackTrace();
			}
			elenco = null;
		}
	}

	
	@Override
	public void enterElenco(ElencoContext ctx) {
		super.enterElenco(ctx);
		if(lastSectionName != null){
			String testo = "";
			String elenco = ctx.Elenco().getText().trim();
			int grado = 0;
			//Un elenco in spagnolo � formato da una serie di ':' per indicarne l'identazione e, a finire, un *,#,: per indicarne il tipo.
			int pos = elenco.lastIndexOf(":");
			if(pos == elenco.length()-1){ //Se la posizione dell'ultimo ':' si trova alla fine pu� essere del tipo ";Testo:" o un elenco senza prefisso ":::::".
				int posPer = elenco.indexOf(";"); //Verifico la posizione del ';' per il caso dell'elenco personalizzato
				if(posPer != -1){ //� un elenco personalizzato
					testo = elenco.substring(posPer+1, pos);
					String d;
					if((d = testo.split(" ")[0]).matches("\\d+")){
						testo = testo.substring(d.length());
					}
					//Elimino, se presenti, le informazioni "{{testo}}" lasciando solamente il testo interno
					int posGraffe = testo.indexOf("{{");
					if(posGraffe != -1){
						int posEndGraffe = testo.indexOf("}}", posGraffe);
						testo = testo.substring(0, posGraffe) + testo.substring(posGraffe+2, posEndGraffe) + testo.substring(posEndGraffe+2);
					} 
					//Calcolo il grado
					int start = elenco.indexOf(":");
					if(start != -1 && start < pos)
						while(elenco.charAt(grado + start) == ':')
							grado++;
					
				} else {
					grado = pos-1;
				}
			} else { //pos indica il grado
				grado = pos+1;
			}
			if(this.elenco == null)
				this.elenco = new Elenco();
			this.elenco.addElenco(grado, testo);
		}
	}
	
	@Override
	public void enterInformazione(InformazioneContext ctx) {
		super.enterInformazione(ctx);
		List<TerminalNode> nodes = ctx.getTokens(SpanishParser.TestoInformazione);
		String str = nodes.get(0).getText();
		OutputVariableNames ovn;
		if(language.sezioniExtra(str)){
			ExtraSection e = language.getSezioneExtra();
			e.addSection(ctx);
			try {
				output.addValue(true, "", e.output(), e.getSectionName());
			} catch (OutputChiaveNonValida | OutputValueIsNull
					| OutputKeyAlreadyExist e1) {
				e1.printStackTrace();
			}
		} else if(lastSectionName != null){
			String testo = null;
			if(!language.specialElenco(str, ctx, elenco)){
				if(str.matches(INFO_TRADUZIONE)){
					String lingua = nodes.get(1).getText(); //Prendo la lingua della traduzione che si trova sempre al secondo posto
					//Creo una nuova mappa che contiene lingua e traduzione
					for(int i = 2; i < nodes.size(); i++){
						testo = nodes.get(i).getText();
						//Il contenuto di ogni traduzione pu� essere formato da: genere (m/f), singolare o plurale (s/p), una virgola (,), un numero decimale, una possibile pronuncia (formata da tr e a seguire la pronuncia)
						if(testo.matches("m|f|,|s|p|\\d+"))
							continue;
						//Rimane: La traduzione e la pronuncia
						//Gestisco la pronuncia
						if(testo.startsWith("tr")){
							if(testo.length() == 2)
								i+=1; //Salto il campo successivo
							continue;
						}
						//Il resto lo aggiungo
						try {
							output.addValue(true, ", ", testo, lastSectionName, lingua);
						} catch (OutputChiaveNonValida | OutputValueIsNull
								| OutputKeyAlreadyExist e) {
							e.printStackTrace();
						}
					}
				} else if(str.equals(INFO_LINK)){
					if(enterElenco){
						testo = nodes.get(1).getText();
						elenco.addText(testo);
					} else {
						try {
							testo = nodes.get(1).getText();
							output.addValue(true, "", testo, lastSectionName);
						} catch (OutputChiaveNonValida | OutputValueIsNull
								| OutputKeyAlreadyExist e) {
							e.printStackTrace();
						}
					}
				}
				if(grassetto && lastSectionName.hasBold()){
					gestGrassetto(testo);
				}
			}
		}
	}
	
	
	@Override
	public void exitTesto(TestoContext ctx) {
		if(lastSectionName != null && enterElenco && grassetto && !elenco.lastHasTitle() && elenco.lastIsEmpty()){
			String text = ctx.getText();
			int ldp = text.lastIndexOf(":");
			if(ldp != -1)
				text = text.substring(0, ldp);
			elenco.setTitle(text.trim());
		}else
			super.exitTesto(ctx);
	}
	
	
}

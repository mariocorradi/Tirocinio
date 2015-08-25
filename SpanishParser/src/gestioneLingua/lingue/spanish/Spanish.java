package gestioneLingua.lingue.spanish;

import enums.OutputVariableNames;
import gestioneLingua.ExtraSection;
import gestioneLingua.Language;

import java.util.HashMap;
import java.util.List;

import objects.Elenco;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.spanish.SpanishParser;
import parser.spanish.SpanishParser.InformazioneContext;

public class Spanish implements Language{
	
	private HashMap<String, OutputVariableNames> mappaSezioni = new HashMap<String, OutputVariableNames>();
	private HashMap<String, OutputVariableNames> mappaElenco = new HashMap<String, OutputVariableNames>();
	private HashMap<String, ExtraSection> extraSection = new HashMap<String, ExtraSection>();
	private ExtraSection sezioneExtra = null;
	
	public Spanish() {
		mappaSezioni.put("Etimología", OutputVariableNames.Etimology);
		mappaSezioni.put("Traducciones", OutputVariableNames.Translation);
//		mappaSezioni.put("Locuciones", OutputVariableNames.Idioms);
		mappaSezioni.put("Refranes", OutputVariableNames.Sayings);
		
		
		mappaElenco.put("Hipónimos", OutputVariableNames.Hyponym);
		mappaElenco.put("Hiperónimos", OutputVariableNames.Hypernyms);
		mappaElenco.put("relacionado", OutputVariableNames.Related);
		mappaElenco.put("sinónimos", OutputVariableNames.Synonyms);
		mappaElenco.put("Ejemplo", OutputVariableNames.Example);
		mappaElenco.put("uso", OutputVariableNames.Use);
		mappaElenco.put("ámbito", OutputVariableNames.Scope);
		
		extraSection.put("pron-graf", new Pronunciation());
		extraSection.put("pronunciación", new PronunciationList());
//		extraSection.put("etimología", new 
		extraSection.put("_type", new Type());
	}
	
	public boolean needTesto(OutputVariableNames nome) {
		if(nome == OutputVariableNames.Translation || nome == OutputVariableNames.Definition)
			return false;
		return true;
	}

	public OutputVariableNames getSectionKey(String value) {
		return mappaSezioni.get(value);
	}



	public boolean containsSectionKey(String value) {
		return mappaSezioni.containsKey(value);
	}

	@Override
	public boolean specialElenco(String key, ParserRuleContext value, Elenco elenco) {
		if(mappaElenco.containsKey(key)){
			InformazioneContext ic = (InformazioneContext) value;
			elenco.addElenco(1, mappaElenco.get(key).toString());
			List<TerminalNode> list = ic.getTokens(SpanishParser.TestoInformazione);
			boolean first = true;
			for(int i = 1; i < list.size() ; i++){
				if(first)
					first = false;
				else
					elenco.addText(", ");
				elenco.addText(list.get(i).getText());
			}
		}
		return false;
	}
	
	@Override
	public boolean sezioniExtra(String nome) {
		if(nome.startsWith("{{")){
			nome = nome.substring(2);
			String[] parts = nome.split("\\|");
			if(!parts[0].equals("lengua")){
				sezioneExtra = extraSection.get("_type");
				return true;
			}
			return false;
		} 
		sezioneExtra = extraSection.get(nome);
		return sezioneExtra != null;
	}
	
	@Override
	public boolean hasSezioneExtra(){return sezioneExtra != null;}
	
	
	@Override
	public ExtraSection getSezioneExtra(){return sezioneExtra; }	
	
}

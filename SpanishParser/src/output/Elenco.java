package objects;

import java.util.ArrayList;
import java.util.HashMap;

import enums.OutputVariableNames;
import enums.SezioneElenco;

public class Elenco {
	
	private ArrayList<HashMap<String, Object>> elenco;
	private int lastProfondita = -1;
	
	public Elenco() {
		elenco = new ArrayList<HashMap<String, Object>>();
	}
	
	public void addElenco(int profondita, String title){
		HashMap<String, Object> map;
		if(profondita == 0){
			map = new HashMap<String, Object>();
			elenco.add(map);
		}
		else {
			map = getLastElenco(profondita-1);
//			elenco.add(map);
			ArrayList<HashMap<String, Object>> list;
			if(map.containsKey(SezioneElenco.Sublist.toString())){
				list = (ArrayList<HashMap<String, Object>>) map.get(SezioneElenco.Sublist.toString());
			} else {
				list = new ArrayList<HashMap<String, Object>> ();
				map.put(SezioneElenco.Sublist.toString(), list);
			}
			map = new HashMap<String, Object>();
			list.add(map);
		}
		if(title != null && !title.equals(""))
			map.put(SezioneElenco.Title.toString(), title);
		lastProfondita = profondita;
	}
	
	public void addText(String value){
		HashMap<String, Object> map = getLastElenco(lastProfondita);
		String oldValue = (String) map.get(SezioneElenco.Content.toString());
		if(oldValue != null)
			value = oldValue + value;
		value = value.trim();
		map.put(SezioneElenco.Content.toString(), value);
	}
	
	public void setTitle(String value){
		HashMap<String, Object> map = getLastElenco(lastProfondita);
		map.put(SezioneElenco.Title.toString(), value);
	}
	
	public void addBold(String value){
		HashMap<String, Object> map = getLastElenco(lastProfondita);
		Object obBold = map.get(OutputVariableNames.Bold.toString());
		ArrayList<String> bolds;
		if(obBold == null){
			bolds = new ArrayList<String>();
			map.put(OutputVariableNames.Bold.toString(), bolds);
		}else
			bolds = (ArrayList<String>) obBold;
		bolds.add(value);
	}
	
	private HashMap<String, Object> getLastElenco(int profondita){
		HashMap<String, Object> map = null;
		ArrayList<HashMap<String, Object>> elenco = this.elenco;
		for(int i = 0; i <= profondita; i++){
			if(elenco.size() == 0){
				map = new HashMap<String, Object>();
				elenco.add(map);
			} else {
				map = elenco.get(elenco.size()-1);
			}
			if(!map.containsKey(SezioneElenco.Sublist.toString()) && i != profondita){
				elenco = new ArrayList<HashMap<String, Object>>();
				map.put(SezioneElenco.Sublist.toString(), elenco);
			}
			elenco = (ArrayList<HashMap<String, Object>>) map.get(SezioneElenco.Sublist.toString());
				
		}
		return map;
	}
	
	public ArrayList<HashMap<String, Object>> getElenco(){
		return new ArrayList<HashMap<String, Object>>(elenco);
	}
	
	
	public boolean lastHasTitle(){
		HashMap<String, Object> map = getLastElenco(lastProfondita);
		return map.containsKey(SezioneElenco.Title.toString());
	}
	
	public boolean lastIsEmpty(){
		HashMap<String, Object> map = getLastElenco(lastProfondita);
		String text = "";
		if(map.containsKey(SezioneElenco.Content.toString()))
			text = ((String) map.get(SezioneElenco.Content.toString())).trim();
		return text.equals("");
	}
	
//	private void createSublist(int profondita){
//		HashMap<String, Object> mappa = getMap(profondita-1);
//		ArrayList<HashMap<String, Object>> sublist = (ArrayList<HashMap<String, Object>>) mappa.get(SezioneElenco.Sublist.toString());
//		if(sublist == null){
//			sublist = new ArrayList<HashMap<String, Object>>();
//			mappa.put(SezioneElenco.Sublist.toString(), sublist);
//		}
//		sublist.add(new HashMap<String, Object>());
//	}
	
}

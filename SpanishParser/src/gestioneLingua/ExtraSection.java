package gestioneLingua;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

import enums.OutputVariableNames;

/**
 * All'interno delle varie pagine, le informazioni che occorre prelevare si trovano all'interno di alcune sezioni con una specifica
 * segnatura.
 * <br>Delle volte, però, alcune informazioni che a noi servono e che vanno gestite come sezioni a parte si trovano in una forma
 * diversa, non riconducibile a sezioni con forma standard. In genere queste informazioni variano da lingua a lingua e si trovano
 * spesso sotto forma di Informazione {{identificativo|testo...}}
 * Per poter gestire queste informazioni, le quali hanno sempre una forma diversa, si utilizza l'<i>interface</i> <b>ExtraSection</b> 
 * che, tramite i suoi metodi, permette di elaborare ogni sezione in modo diverso ma tramite i medesimi metodi.
 */
public interface ExtraSection {
	
	
	/**
	 * Valore numerico utilizzato per la funzione addText per indicare la tipologia di testo che si sta inserendo
	 */
	public final int STRING=1, INFORMAZIONE=2, ELENCO=3;
	
	/**
	 * Una volta determinato che il <i>ParserRuleContext</i> che si sta analizzando fa parte dell'<i>ExtraSection</i>
	 * si utilizza questo metodo per poter analizzare la sezione ed elaborarne il contentuo.
	 * Essendo ParserRuleContext la super classe di qualsiasi altro context, questo potrà, in caso, essere castato dove occorre.
	 * @param ParserRuleContext generico utilizzato per elaborarne il contenuto.
	 */
	public void addSection(ParserRuleContext prc);
	
	/**
	 * Alcune sezioni extra possono accettare del testo (o qualsiasi altro contenuto) affianco a se in modo da ampliare la sezione.
	 * @return <b>true</b> se la sezione può contenere del testo aggiuntivo
	 * <br><b>false</b> altrimenti
	 */
	public boolean hasAdditionalText();
	
	/**
	 * Metodo utilizzato per aggiungere del testo (o qualsiasi altro contenuto) alla sezione extra
	 * @param value è un oggetto generico che deve essere elaborato ed inserito come content (in genere) alla sezione extra
	 * @param type indica il tipo di oggetto che si sta inserendo. Si utilizzano le variabili STRING, INFORMAZIONE, ELENCO ecc
	 */
	public void addText(Object value, int type);
	
	/**
	 * Ogni ExtraSection si riferisce ad una sezione particolare specifica per la classe.
	 * @return La variabile <b>OutputVariableNames</b> che indica la sezione
	 */
	public OutputVariableNames getSectionName();
	
	/**
	 * Metodo utilizzato una volta elaborato il contenuto per ritornare l'oggetto che deve essere utilizzato come output.
	 * @return un <b>Object</b> che rappresenta il contenuto della sezione extra.
	 */
	public Object output();

}

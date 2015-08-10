package gestioneLingua;

import enums.OutputVariableNames;

public interface Language {
	
	
	/**
	 * Alcuni nomi di sezioni non possono essere inserite all'interno del parser ma occorre prenderle lo stesso.
	 * Tramite questo metodo è possibile verificare se bisogna prendere una sezione o meno.
	 * @param nome della sezione da valutare
	 * @return <b>null</b> se <b>nome</b> non è una sezione, altrimenti torna il OutputVariableNames della sezione
	 */
	public OutputVariableNames sezioniExtra(String nome);
	
	
	/**
	 * Di alcune sezioni può non occorrere il contenuto del testo ma, ad esempio, solo il contenuto di informazioni o altro.
	 * Tramite questa funzione è possibile conoscere, per quale sezioni, non occorre prendere il testo
	 * @param nome della sezione
	 * @return true se bisogna prendere il testo, false altrimenti
	 */
	public boolean needTesto(OutputVariableNames nome);
	
	
	/**
	 * Le sezioni, nelle diverse lingue, vengono specificate con nomi diversi. Tramite questa funzione è possibile, dato il nome
	 * della sezione nella lingua specifica, ottenere un enum <b>OutputVariableNames</b> per ottenerne il nome universale della sezione
	 * @param value della sezione
	 * @return OutputVariableNames corrispettivo
	 */
	public OutputVariableNames getSectionKey(String value);
	
	
	/**
	 * Funzione utilizzata per sapere se, data una stringa che corrisponde al nome di una sezione, bisogna prenderla ed elaborarne il contenuto o meno
	 * @param value della sezione
	 * @return true se bisogna prendere la sezione, false altrimenti.
	 */
	public boolean containsSectionKey(String value);

}

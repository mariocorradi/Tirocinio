package objects.output;

import eccezione.OutputChiaveNonValida;
import eccezione.OutputKeyAlreadyExist;
import eccezione.OutputValueIsNull;

public interface Output {
	
	/**
	 * L'enciclopedia è formata da diverse pagine. Tramite questa funzione è, quindi, possibile considerare che gli elementi
	 * che verranno inseriti da questo punto in avanti, faranno parte della nuova pagina.
	 * @param key l'id della pagina
	 */
	public void newPage(String key);
	
	
	/**
	 * Tramite questa funzione è possibile associare ad una chiave un possibile oggetto.
	 * @param key
	 * @param value
	 */
	public void addValue(String key, Object value);

	
	public void concanateValue(String key, String value);
	
	public void concanateArray(String key, Object value);
	
	/**
	 * Tramite questa funzione è possibile aggiungere/concatenare un certo oggetto (anche stringa) ad una certa chiave
	 * @param concatena true indica che bisogna concatenare il valore precedente della chiave a quello nuovo, false significa che è una semplice aggiunta (chiave, valore)
	 * @param separatore se concatena è true indica il carattere con cui separare le stringhe. Se il valore di separatore è null, allora non bisogna separare le stringhe
	 * @param value il valore da aggiungere
	 * @param createIfNotExist true indica che se la penultima chiave non esiste bisogna crearla, false altrimenti
	 * @param keys permette di scendere nell'output fino ad arrivare alla chiave interessata
	 * @throws OutputChiaveNonValida indica che la chiave inserita non è valida: o una delle chiavi non è presente nell'output generato oppure non è stata inserita nessuna chiave
	 * @throws OutputValueIsNull il nuovo valore è null e quindi non può essere inserito 
	 * @throws OutputKeyAlreadyExist Nel caso in cui <b>concatena</b> è false ma la chiave del valore da aggiungere è già presente
	 */
	public void addValue(boolean concatena, String separatore, Object value, boolean createIfNotExist, String...keys) throws OutputChiaveNonValida, OutputValueIsNull, OutputKeyAlreadyExist;
	
}


/**
 * Questa classe descrive parole di un documento. la classe contiene un paio di
 * errori
 * 
 * @author alber
 *
 */
public class Word {

	private String text;

	/**
	 * Costruisce una parola eliminando caratteri iniziali e finali che non siano
	 * lettere, come i segni di punteggiatura.
	 * 
	 * @param s la stringa di ingresso
	 */
	public Word(String s) {
		int i = 0;
		while (i < s.length() && !Character.isLetter(s.charAt(i))) {
			i++;
		}
		int j = s.length() - 1;

		while (j > i && !Character.isLetter(s.charAt(j))) {
			j--;
		}
		text = s.substring(i, j + 1);
	}

	/**
	 * Restituisce il testo della parola.
	 * 
	 * @return il testo della parola
	 */
	public String getText() {
		return text;
	}

	/**
	 * Conta le sillabe nella parola.
	 * 
	 * @return il numero di sillabe
	 */
	public int countSyllables() {
		int count = 0;
		int end = text.length() - 1;
		if (end < 0) {
			return 0;
		} // la string vuota non ha sillabe

		// una 'e' alla fine della parola non conta come vocale
		char ch = Character.toLowerCase(text.charAt(end));
		if (ch == 'e')
			end--; // riga 47 del codice (per il debugging)

		boolean insideVowelGroup = false;
		for (int i = 0; i <= end; i++) {

			ch = Character.toLowerCase(text.charAt(i));
			String vowels = "aeiouy";
			if (vowels.indexOf(ch) >= 0) {
				// ch e' una vocale
				if (!insideVowelGroup) {
					// inizia un nuovo gruppo di vocali
					count++;
					insideVowelGroup = true;
				}
			}
		}
		// ogni parola ha almeno una sillaba
		if (count == 0) {
			count = 1;
		}
		return count;
	}

}

package com.albertb.callback;
import java.awt.Rectangle;
import java.util.Scanner;

public class DataAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/**
		 * Siccome abbiamo creato la classe RettangoloMisurabile che implementa Mesurer
		 * che a sua volta questa classe RettangoloMisurabile crea un dipendenza
		 * con la classe Rettangolo, questo permette cosi facendo di poter passare
		 * al interno del costruttore Dataset un Oggetto che implementa Mesurer
		 * infatti passando il riferimento della Oggetto della classe RectangleMeasure
		 * passiamo al Oggetto Mesurer anche l'implementazioni del Oggetto RectangleMeasure
		 * cosi poi indifferentemente dai oggetti che si passano sara' compito degli 
		 * Oggetti che implementano l'interfaccia rispettare i parametri di ritorno ecc...
		 */
		DataSet data = new DataSet(new RectangleMeasurer()); //new RectangleMeasurer si chiama Oggetto Anonimo
		data.add(new Rectangle(2,3,4,5)); // idem pure questi successivi new Rectangle sono Oggetti Anonimi
		data.add(new Rectangle(2,3,34,12));
		data.add(new Rectangle(2,3,34,23));
		data.add(new Rectangle(2,3,54,46));
		
		
	}

}

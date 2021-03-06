package com.albertb.interfaces;

/**
 * calcola informazioni relative a un insieme di dati.
 * @author alber
 *
 */
public class DataSet {
	
	private double sum;
	private Measurable maximum;
	private int count;
	
	/**
	 * Costruisce un insieme di dati vuoto
	 */
	public DataSet() {
		sum = 0;
		count = 0;
		maximum = null;
	}
	
	/**
	 * Aggiunge un valore all'insieme di dati
	 * @param x un valore
	 */
	public void add(Measurable x) {
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure()) maximum = x; // se count == 0 o il massimo e' minore di x, allora il massimo prende 0
		count++;
	}
	
	/**
	 * Restituisce la media dei valori inseriti.
	 * @return la media, oppure 0 se non sono stati inseriti dati.
	 */
	public double getAverage() {
		if (count == 0) return 0;
		else return sum / count;
	}
	
	/**
	 * Restituisce il valore massimo tra i valori inseriti.
	 * @return il massimo, oppure 0 se non sono stati inseriti dati
	 */
	public double getMaximum() {
		return maximum.getMeasure();
	}

}

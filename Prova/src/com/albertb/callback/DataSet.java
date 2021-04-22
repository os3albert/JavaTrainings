package com.albertb.callback;

/**
 * calcola informazioni relative a un insieme di dati.
 * @author alber
 *
 */
public class DataSet {
	
	private double sum;
	private Object maximum;
	private int count;
	private Mesurer mesurer;
	
	/**
	 * Costruisce un insieme di dati vuoto
	 * @param aMesurer l'oggetto che implementa Mesurer verra'
	 * passato come parametro quando si costruisce l'oggetto
	 */
	public DataSet(Mesurer aMesurer) {
		sum = 0;
		count = 0;
		maximum = null;
		mesurer = aMesurer;
	}
	
	/**
	 * Aggiunge un valore all'insieme di dati
	 * @param x un valore
	 */
	public void add(Object x) {
		sum = sum + mesurer.measure(x); // questo svolge la funzione di leggere il valore del oggetto passato come parametro
		if (count == 0 || mesurer.measure(maximum) < mesurer.measure(x)) maximum = x; // se count == 0 o il massimo e' minore di x, allora il massimo prende x
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
		return 
	}

}

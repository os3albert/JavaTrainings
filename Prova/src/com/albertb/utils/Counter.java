package com.albertb.utils;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author alber
 * people counter
 *
 */
public class Counter {
	
	private int value;
	private static int numero;
	/**
	 * start the counter
	 */
	public Counter() {
		this.value = 0;
		Logger.getGlobal().info("sono dentro il counter");
		Counter.numero = 3;
		
	}
	
	public int getCountCounter() {
		Counter.numero++;
		return Counter.numero;
	}
	
	public int collateralMethod(ArrayList<Integer> number) {
		
		int count = 0;
		for (int i = 0; i < number.size(); i++) {
			number.remove(i);
			count++;
		}
		
		return count;
		
	}
	
	/**
	 *  Increment the counter
	 */
	public void count() {
		this.value++;
	}
	
	/**
	 * @return the value of all increments
	 */
	public int getValue() {
		return this.value;
	}
	
	public void reset() {
		this.value = 0;
	}

}

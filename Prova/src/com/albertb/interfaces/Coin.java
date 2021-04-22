package com.albertb.interfaces;

public class Coin implements Measurable {
	
	private String name;
	private double value;

	/**
	 * @param value inizializza i valori
	 */
	public Coin(double value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}

}

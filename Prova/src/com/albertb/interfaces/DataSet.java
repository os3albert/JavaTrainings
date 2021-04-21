package com.albertb.interfaces;

public class DataSet {
	
	private double sum;
	private double maximum;
	private int count;
	
	public DataSet() {
		sum = 0;
		count = 0;
		maximum = 0;
	}
	
	public void add(double x) {
		sum = sum + x;
		if (count == 0 || maximum < x) maximum = 0;
		count++;
	}
	
	public double getAverage() {
		if (count == 0) return 0;
		else return sum / count;
	}
	
	public double getMaximum() {
		return maximum;
	}

}

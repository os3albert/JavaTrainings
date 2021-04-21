package com.albertb.utils;

/**
 * @author alber
 * Clock Object
 *
 */
public class Clock {
	
	private int hours;
	private int minutes;
	public enum type { ore, minuti };
	
	
	/**
	 * @return hour
	 */
	public int getHours() {
		return hours;
	}
	/**
	 * @return minutes
	 */
	public int getMinutes() {
		return minutes;
	}
	/**
	 * @param hours actual value
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}
	/**
	 * @param minutes actual value
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	

}

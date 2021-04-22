package com.albertb.interfaces;

public class BankAccount implements Measurable{
	
	private double balance;
	
	/**
	 * @param initialCash your actual cash
	 */
	public BankAccount(double initialCash) {
		this.balance = initialCash;
	}
	
	/**
	 * @param cash deposit cash on bankaccount
	 */
	public void deposit(double cash) {
		this.balance = this.balance + cash;
	}
	
	/**
	 * @param cash remove cash from bankaccount
	 */
	public void withdraw(double cash) {
		this.balance = this.balance - cash;
	}

	@Override
	public double getMeasure() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	
	
	
	

}

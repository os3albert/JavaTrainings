package com.albertb.interfaces;


public class DatasetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataSet bankData = new DataSet();
		
		bankData.add(new BankAccount(0));
		bankData.add(new BankAccount(10000));
		bankData.add(new BankAccount(2000));
		
		System.out.println("Average balance: " + bankData.getAverage());
		System.out.println("Expected: 4000");
		double max = bankData.getMaximum();
		System.out.println("Highest balance: " + max);
		System.out.println("Expected: 10000");
		
		DataSet coinData = new DataSet();
		
		coinData.add(new Coin(0.25, "quarter"));
		coinData.add(new Coin(0.1, "dime"));
		coinData.add(new Coin(0.05, "nickel"));
		
		System.out.println("Average coin value: " + coinData.getAverage());
		System.out.println("Expected: 0.133");
		max = coinData.getMaximum();
		System.out.println("Highest coin value: " + max);
		System.out.println("Expected: 0.25");
		
		BankAccount account = new BankAccount(100);
		Measurable meas = account; // l'interfaccia measurable si riferisce al oggetto account, ovvero definisce i metodi che quel oggetto ha implementato
		// quindi se dovessi fare la stampa meas.getMeasure() avremmo il valore del account.
		System.out.println(meas.getMeasure());
		
		
		
		
	}

}

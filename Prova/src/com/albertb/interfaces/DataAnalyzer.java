package com.albertb.interfaces;
import java.util.Scanner;
public class DataAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DataSet data = new DataSet();
		
		boolean done = false;
		while (!done) {
			System.out.print("Enter value, Q to quit: ");
			String input = in.next();
			if (input.equals("q")){
				done = true;
			}else{
				double x = Double.parseDouble(input);
				data.add(x);
			}
		}
		
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.getMaximum());
		
	}

}

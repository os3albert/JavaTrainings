package com.albertb.ereditarieta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter printWriter = new PrintWriter("C:\\Users\\alber\\Desktop\\output.txt");
			printWriter.println("Welcome!");
			printWriter.print("Ciao Marti!");
			printWriter.close();
			
			File file = new File("C:\\Users\\alber\\Desktop\\output.txt");
			Scanner in = new Scanner(file);
			System.out.println(in.nextLine());
			System.out.println(in.nextLine());
			System.out.println(args[0]);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

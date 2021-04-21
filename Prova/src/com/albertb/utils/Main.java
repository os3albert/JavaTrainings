package com.albertb.utils;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger.getGlobal().setLevel(Level.OFF);
		
		
		Counter c = new Counter();
		System.out.println(c.getCountCounter());
		
		Logger.getGlobal().setLevel(Level.INFO);
		
		Logger.getGlobal().info("ciao a tutti");
		
		ArrayList<Integer> numeri = new ArrayList<>();
		numeri.add(1);
		numeri.add(3);
		
		System.out.println(numeri);
		c.collateralMethod(numeri);
		System.out.println(numeri + "numeri");
//		
//		MultiVal elementi = new MultiVal(1,3,5);
//		elementi.add(3, 5, 6);
//		
//		int[] nums = new int[3];
//		nums[0] = 20;
//		nums[1] = 30;
//		nums[2] = 40;
//
//		elementi.add(nums); // nei parametri variabili si possono passare anche i valori del array come parametri
//		
//		System.out.println(elementi.toString());
		
		
		c.count();
		c.count();
		c.count();
		c.reset();
		
		System.out.println(c.getValue());
		
		Clock time = new Clock();
		time.getHours();
		time.getMinutes();
		
		System.out.println(Clock.type.minuti);
		
		String ciao = "Ciao Mondo!";
		
		System.out.println(ciao.substring(5, 5+5));
		System.out.println("\uD835");
		
//		System.out.println("inserisci un numero");
//		Scanner in = new Scanner(System.in);
//		String numero = in.next();
//		System.out.printf("%s", numero);
		
//		String input = JOptionPane.showInputDialog("inserisci il numero");
//		JOptionPane.showMessageDialog(null, input);
//		System.exit(0);
//		Math.abs(0);
		
		String dao = "ciao";
		System.out.println(dao.compareTo("aiao"));
		
	}
	
	static int somme(int... numeri) {
		int res = 0;
		
		for (int i : numeri) {
			res += i;
		}
		
		return res;
	}

}

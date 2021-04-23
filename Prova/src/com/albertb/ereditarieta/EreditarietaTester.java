package com.albertb.ereditarieta;

public class EreditarietaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Figlio figlio = new Figlio(30);
		figlio.elemPadre();
		figlio.moglie = 30;
		
		System.out.println(figlio.toString());
	}

}

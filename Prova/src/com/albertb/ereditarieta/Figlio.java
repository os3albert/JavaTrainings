package com.albertb.ereditarieta;

public class Figlio extends Padre {
	
	private int anni;

	public Figlio(int anni) {
		super();
		this.anni = anni;
		
	}


	public void elemPadre() {
		// TODO Auto-generated method stub
		setNroFigli(13);
		System.out.println(getNroFigli());
		System.out.println();
	}


	@Override
	public int getNroFigli() {
		// TODO Auto-generated method stub
		return super.getNroFigli();
	}
	
	public void getNroFigli(String value) {
		
	}
	
	public void getNroFigli(int value) {
		
	}

	@Override
	public void saluto(String ciao) {
		// TODO Auto-generated method stub
		System.out.println("ciao mondo");
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}

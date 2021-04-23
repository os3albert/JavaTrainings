package com.albertb.ereditarieta;

public abstract class Padre {
	
	private int nroFigli;
	public int moglie = 0;

	/**
	 * @param nroFigli
	 */
	public Padre(int nroFigli) {
		super();
		this.nroFigli = nroFigli;
	}

	public Padre() {
		// TODO Auto-generated constructor stub
	}

	public int getNroFigli() {
		return nroFigli;
	}

	public void setNroFigli(int nroFigli) {
		this.nroFigli = nroFigli;
	}
	
	public abstract void saluto(String ciao);
	
	

}

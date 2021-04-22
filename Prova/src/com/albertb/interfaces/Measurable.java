package com.albertb.interfaces;

public interface Measurable {
	
	/**
	 * Costante di un interfaccia non ha bisogno di
	 * public static final perche' nelle interfacce
	 * questo e' implicito.
	 */
	String COSTANTEINTERFACCIA = "UN INTERFACCIA";
	
	/**
	 * @return value of double
	 */
	double getMeasure();
	

}

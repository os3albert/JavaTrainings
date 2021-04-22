package com.albertb.callback;

import java.awt.Rectangle;

public class RectangleMeasurer implements Mesurer {

	@Override
	public double measure(Object anObject) {
		// TODO Auto-generated method stub
		Rectangle rectangle = (Rectangle) anObject; // Creaiamo una dipendenza con la classe Rectangle
		// allo stesso tempo ci permette di usare la classe Rectangle per implementare delle nostre Interfacce
		double area = rectangle.getWidth() * rectangle.getHeight();
		return area;
	}

}

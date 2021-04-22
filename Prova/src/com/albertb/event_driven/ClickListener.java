/**
 * 
 */
package com.albertb.event_driven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author alber
 * un ricevitore di azioni che visualizza un messaggio
 */
public class ClickListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("I was clicked");
		
	}
	
	

}

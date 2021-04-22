package com.albertb.event_driven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonViewer {

	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me");
		frame.add(button);

		/**
		 * 
		 * @author alber
		 * Facendo cosi si evita di creare classi inutili, anche perche'
		 * in realta' l'evento e' associato a questo particolare pulsante nella vista
		 * 
		 */
		class ClickListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("I was clicked");

			}
		};

		ActionListener listener = new ClickListener();
		button.addActionListener(listener);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

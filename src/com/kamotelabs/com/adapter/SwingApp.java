package com.kamotelabs.com.adapter;

import javax.swing.JFrame;

public class SwingApp {
	
	/**
	 * NOT the adapter pattern
	 * 
	 */
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

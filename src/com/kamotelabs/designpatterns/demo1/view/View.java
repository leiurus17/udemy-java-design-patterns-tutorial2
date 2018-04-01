package com.kamotelabs.designpatterns.demo1.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.kamotelabs.designpatterns.demo1.model.Model;

public class View extends JFrame {
	
	private Model model;
	private JButton helloButton;

	public View(Model model) {
		super("MVC Demo");
		
		this.model = model;
		
		helloButton = new JButton("Click Me!");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridheight = 0;
		gc.gridwidth = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(helloButton, gc);
		
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

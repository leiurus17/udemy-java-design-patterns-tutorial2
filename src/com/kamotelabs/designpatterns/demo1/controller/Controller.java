package com.kamotelabs.designpatterns.demo1.controller;

import com.kamotelabs.designpatterns.demo1.model.Model;
import com.kamotelabs.designpatterns.demo1.view.LoginListener;
import com.kamotelabs.designpatterns.demo1.view.View;

public class Controller implements LoginListener {
	
	private View view;
	private Model model;
	
	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed() {
		// TODO Auto-generated method stub
		
	}
	
	

}

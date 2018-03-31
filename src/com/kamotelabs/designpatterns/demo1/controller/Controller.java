package com.kamotelabs.designpatterns.demo1.controller;

import com.kamotelabs.designpatterns.demo1.model.Model;
import com.kamotelabs.designpatterns.demo1.view.View;

public class Controller {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	

}

package com.kamotelabs.designpatterns.demo1.model;

public class Database {
	
	private static Database instance = new Database();
	
	// prevent people for doing "new"
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}

}

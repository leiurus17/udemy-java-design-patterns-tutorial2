package com.kamotelabs.designpatterns.demo1.model;

public class Database {
	
	private static Database instance = new Database();
	
	// prevent people for doing "new"
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	
	// lazy instantiation
	private static Database instanceOld;
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	
	public void connect() {
		System.out.println("Connected to the database.");
	}
	
	public void disconnect() {
		System.out.println("Disconnected.");
	}

}

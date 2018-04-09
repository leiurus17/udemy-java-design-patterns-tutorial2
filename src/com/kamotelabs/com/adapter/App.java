package com.kamotelabs.com.adapter;

public class App {

	public static void main(String[] args) {

		// Composition Adapter
		ConsoleLogWriter logWriter = new ConsoleLogWriter();
		
		// Inheritance Adapter
		ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();
		
		Logger logger = new Logger(logWriter);
		Logger logger2 = new Logger(logWriter2);
		
		logger.write("Hello there!");
		logger2.write("The angel from my nightmare.");
	}

}

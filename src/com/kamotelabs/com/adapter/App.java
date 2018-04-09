package com.kamotelabs.com.adapter;

public class App {

	public static void main(String[] args) {

		ConsoleLogWriter logWriter = new ConsoleLogWriter();
		Logger logger = new Logger(logWriter);
		
		logger.write("Hello there!");
	}

}

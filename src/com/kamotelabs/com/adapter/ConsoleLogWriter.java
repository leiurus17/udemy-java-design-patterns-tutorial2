package com.kamotelabs.com.adapter;

public class ConsoleLogWriter implements LogWriter {

	// Adapter class
	
	private ConsoleWriter consoleWriter = new ConsoleWriter();
	
	@Override
	public void out(String text) {
		consoleWriter.writeConsole(text);
	}

}

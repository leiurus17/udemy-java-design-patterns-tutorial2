package com.kamotelabs.com.adapter;

public class ConsoleLogWriter2 extends ConsoleWriter implements LogWriter {

	// This is also an Adapter class
	
	@Override
	public void out(String text) {
		writeConsole(text);
	}

}

package com.kamotelabs.com.adapter;

public class Logger {

	public LogWriter logWriter;
	
	public Logger(LogWriter logWriter) {
		this.logWriter = logWriter;
	}
	
	public void write(String text) {
		logWriter.out(text);
	}
}

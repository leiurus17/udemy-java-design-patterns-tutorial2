package com.kamotelabs.com.facade;

public class App {

	public static void main(String[] args) {

		Game game = new Game();
		
		while(true) {
			game.update();
		}
		
	}

}

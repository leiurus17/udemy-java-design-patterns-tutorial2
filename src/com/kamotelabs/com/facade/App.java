package com.kamotelabs.com.facade;

public class App {

	public static void main(String[] args) {

		InputSystem input = new InputSystem();
		GameObjects objects = new GameObjects();
		GameConsole screen = new GameConsole();
		
		while(true) {
			// Input
			input.getInput();
			
			// Update game objects (player, bad guys, etc)
			objects.update(input);
			
			// Draw
			screen.draw(objects);
		}
		
	}

}

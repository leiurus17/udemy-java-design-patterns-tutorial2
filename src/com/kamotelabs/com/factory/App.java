package com.kamotelabs.com.factory;

/**
 * 
 * Factory pattern
 * Want to create objects implementing some interface
 * or having same parent
 * Creating an object is complex
 * e.g. lots of constructor parameters
 * Possible to simplify choice of objects
 * 
 * @author Lon
 *
 */

public class App {
	
	public static void main(String[] args) {
	
		Animal animal1 = AnimalFactory.createAnimal(AnimalFactory.CAT);
		Animal animal2 =  AnimalFactory.createAnimal(AnimalFactory.DOG);
		
		animal1.speak();
		animal2.eat();
	}

}
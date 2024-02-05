package com.multi_threading;

public class MultiThreadingUsingSingleRunMethodApp {

	public static void main(String[] args) {
		// Creating the thread objects.
		Program3 t1 = new Program3();
		Program3 t2 = new Program3();
		
		// Changing the thread object name.
		t1.setName("Number");
		t2.setName("Char");
		
		// Calling the start which will call run() internally.
		t1.start(); // Starting the thread for numPrinting.
		t2.start(); // Starting the thread for charPrinting.

	}

}

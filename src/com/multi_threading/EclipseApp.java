package com.multi_threading;

public class EclipseApp {

	public static void main(String[] args) {
		// Creating the object of compilation, save and typing class.
		Typing type = new Typing();
		Compilation comp = new Compilation();
		Saving sav = new Saving();
		
		// Setting the daemon thread status as true.
		comp.setDaemon(true);
		sav.setDaemon(true);
		
		// Starting the threads.
		type.start();
		comp.start();
		sav.start();

	}

}

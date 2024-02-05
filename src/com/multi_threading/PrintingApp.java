package com.multi_threading;

public class PrintingApp {

	public static void main(String[] args) {
		// Creating the object of numPrinting and CharPrinting class which are also thread class.
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		
		// Now we are starting or calling the threads.
		np.start();
		cp.start();

	}

}

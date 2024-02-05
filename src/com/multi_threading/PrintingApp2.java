package com.multi_threading;

public class PrintingApp2 {

	public static void main(String[] args) {
		// Creating the object of NumPrinting2 and CharPrinting2 classes.
		NumPrinting2 np2 = new NumPrinting2();
		CharPrinting2 cp2 = new CharPrinting2();
		
		// Now we are creating the object of thread class using the objects of charPrinting and NumPrinting classes.
		Thread t1 = new Thread(np2);
		Thread t2 = new Thread(cp2);
		
		// Now we are calling the start method of thread class to start the threads. Internally start method will call the run method of thread class. 
		t1.start();
		t2.start();
	}

}

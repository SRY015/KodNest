// In this program we are achieving multiThreading by extending Thread class.
package com.multi_threading;

public class CharPrinting extends Thread{
	public void run() {
		System.out.println("Char Printing Started.");
		for(char i='A';i<='E';i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Char Printing Ended.");
	}
}

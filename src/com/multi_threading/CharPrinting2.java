// In this program we are achieving multiThreading by implementing Runnable interface.

package com.multi_threading;

public class CharPrinting2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Character printing started.");
		
		for(char i='A'; i<='E'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing ended.");
	}
}

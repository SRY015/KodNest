// In this program we are achieving multiThreading by implementing Runnable interface.

package com.multi_threading;

public class NumPrinting2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Number printing started.");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number Printing ended.");	
	}
}

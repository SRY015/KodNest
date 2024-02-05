// In this program we are achieving multiThreading by extending Thread class.

package com.multi_threading;

public class NumPrinting extends Thread{
	public void run() {
		System.out.println("Number Printing started.");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing ended.");
	}

}

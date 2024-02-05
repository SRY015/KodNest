package com.multi_threading;

public class Saving extends Thread{
	public void run() {
		try {
			for(; ;) {
				System.out.println("Saving the code.");
				Thread.sleep(3000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

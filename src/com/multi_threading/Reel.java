package com.multi_threading;

public class Reel extends Thread{
	public void run() {
		try {
			
			System.out.println("Creating a reel.");
			Thread.sleep(2000);
			System.out.println("Posting The reel.");
			Thread.sleep(2000);
			System.out.println("Uploading The reel.");
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

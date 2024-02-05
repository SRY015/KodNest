package com.multi_threading;

public class Chatting extends Thread{
	public void run() {
		try {
			
			System.out.println("Chatting is started.");
			Thread.sleep(2000);
			System.out.println("Chattin is happening.");
			Thread.sleep(2000);
			System.out.println("Chating ended.");
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

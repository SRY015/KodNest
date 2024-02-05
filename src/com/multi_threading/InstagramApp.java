package com.multi_threading;

public class InstagramApp {

	public static void main(String[] args) {
		try {
			System.out.println("Instagram App is opened.");
			
			// Creating the object of Reel and Chatting class.
			Chatting ch = new Chatting();
			Reel rl = new Reel();
			
			// Starting the threads.
			ch.start();
			rl.start();
			
			// joining the threads.
			ch.join();
			rl.join();
			
			// Join() : The join method is used join a thread with another thread in such a way that the thread with which another thread is 
			// joined will not complete it's task until the joined thread completes it's task.
			
			System.out.println("Instagram App is closed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

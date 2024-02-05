// Changing the thread name and thread priority.

package com.multi_threading;

public class Program2 {

	public static void main(String[] args) {
		// Accessing the current executing thread object.
		Thread t = Thread.currentThread();
		
		// Printing the initial thread name, thread priority, thread group name.
		System.out.println(t);
		
		// Changing the thread name.
		t.setName("My-thread1");
		
		// Changing the thread priority.
		t.setPriority(9);
		
		// After changing the thread details printing the thread name, thread priority, thread group name.
		System.out.println(t);

	}

}

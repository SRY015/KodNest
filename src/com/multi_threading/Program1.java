// This is first program of multi-threading. In this program we are going to print the details of the current thread.
// while printing the details of a thread, currentThread() method is used which will print 3 information about the thread.
// These are - i.Thread name. ii.Priority of the thread. iii.The thread group name.

package com.multi_threading;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
	}

}

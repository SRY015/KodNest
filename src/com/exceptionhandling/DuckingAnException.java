package com.exceptionhandling;

import java.util.Scanner;

public class DuckingAnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Calculation is started.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int a = sc.nextInt();
			System.out.println("Enter the second number : ");
			int b = sc.nextInt();
			
			divide(a,b);
			
		}catch(Exception e) {
			System.out.println("Exception is handled in main method.");
		}
		System.out.println("Calculation is ended.");
	}
	
	public static void divide(int a, int b) throws Exception { // Here we are ducking an exception.
		int divres = a/b;
		System.out.println("Division result is : "+divres);
	}

}

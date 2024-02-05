package com.exceptionhandling;

import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			System.out.println("Program execution started.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int a = sc.nextInt();
			System.out.println("Enter second number : ");
			int b = sc.nextInt();
			
			int c = a/b;
			
			System.out.println("Divres = "+c);
			
		}catch(Exception e) {
			System.out.println("Exception is handled.");
		}
		System.out.println("Program execution ended.");

	}

}

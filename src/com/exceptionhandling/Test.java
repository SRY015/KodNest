package com.exceptionhandling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program execution started");
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		
		int c = a/b;
		
		System.out.println("Divres = "+c);
		System.out.println("Program execution ended.");

	}

}

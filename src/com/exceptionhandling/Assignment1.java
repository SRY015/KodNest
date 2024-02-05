package com.exceptionhandling;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Calculation is started.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int a = sc.nextInt();
			System.out.println("Enter second number : ");
			int b = sc.nextInt();
			add(a,b);
			sub(a,b);
			mul(a,b);
			div(a,b);
		}catch(Exception e) {
			System.out.println("Exception is handled in main method.");
			e.printStackTrace();
		}finally {
			System.out.println("Calculation is ended.");
		}


	}
	public static void add(int a, int b)throws Exception {
		System.out.println("Addition is started.");
		int sum = a + b;
		System.out.println("Result of sum = "+sum);
		System.out.println("Addition is ended.");
	}
	public static void sub(int a, int b) {
		System.out.println("Subtraction is started.");
		try {
			int sub = a - b;
			System.out.println("Result of subtraction = "+sub);
		}catch(Exception e) {
			System.out.println("Exception is handled in sub method.");
		}finally {
			System.out.println("Subtraction is ended.");
		}		
	}
	public static void mul(int a,int b) {
		System.out.println("Multiplication is started.");
		try {
			int mul = a * b;
			System.out.println("Result of multiplication = "+mul);
		}catch(Exception e) {
			System.out.println("Exception is handled in mul method.");
		}finally {
			System.out.println("Multiplication is ended.");
		}
	}
	public static void div(int a,int b)throws Exception {
		System.out.println("Division is started.");
		try {
			int div = a/b;
			System.out.println("Result of division = "+div);
		}catch(Exception e) {
			System.out.println("Exception is handled in div method.");
			throw e;
		}finally {
			System.out.println("Division is ended.");
		}
	}
	

}

// Propagation of exception is the process of transferring an exception generated in a method to it's caller method.
// This continues until the exception is handled by UDEH(User Defined Exception Handler) or if none of the methods are handling the 
// exception than the exception will be handled by default exception handler(DEH).

package com.exceptionhandling;

import java.util.Scanner;

public class PropogationOfException {

	public static void main(String[] args) {
		System.out.println("Calculation is started.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		multiply(a,b);
		System.out.println("Calculation is ended.");

	}
	public static void multiply(int a,int b) {
		System.out.println("Multiplication is started");
		int mulres = a*b;
		System.out.println("Mulres = "+mulres);
		divide(a,b);
		System.out.println("Multiplication is ended.");
	}
	public static void divide(int a,int b) {
		System.out.println("Division is started.");
		int divres = a/b;
		System.out.println("Division result is : "+divres);
		System.out.println("Division is ended");
	}
}

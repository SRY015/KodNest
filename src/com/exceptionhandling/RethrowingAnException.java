package com.exceptionhandling;

import java.util.Scanner;

public class RethrowingAnException {

	public static void main(String[] args) {
		shop();
	}
	static void shop() {
		System.out.println("Shopping is started");
		try {
			pay(); // This method is re-throwing the exception so keeping it in try-catch block.
		}catch(Exception e) {
			System.out.println("Exception is handled in shopping method");
		}finally{
			System.out.println("Shopping is completed");
		}
	}
	
	static void pay() throws Exception{ // providing the warning to the caller method.
		try {
			System.out.print("Payment is started");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to be paid.");
			int amount = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Exception is handled in pay method");
			throw e;
		}finally {
			System.out.println("Payment is completed.");
		}
	}

}

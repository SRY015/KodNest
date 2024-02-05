package com.exceptionhandling;

import java.util.Scanner;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println("Program execution is started.");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter numerator : ");
			int a = sc.nextInt();
			System.out.print("Enter denominator : ");
			int b = sc.nextInt();

			int c = a/b;

			System.out.println("Division result is : "+c);
			System.out.print("Enter the size to create an array : ");
			int size = sc.nextInt();

			int arr[] = new int[size];
			System.out.print("Enter the element to be stored in the array : ");
			int elem = sc.nextInt();
			System.out.print("Enter the index at which element has to be stored : ");
			int index = sc.nextInt();
			arr[index] = elem;
			System.out.println("Element is inserted into the array.");

		}catch(ArithmeticException ae) { // Specific catch block to handle ArithmeticException.

			System.out.println("Don't provide 0 in denominator.");

		}catch(ArrayIndexOutOfBoundsException aioe) { // Specific catch block to handle ArrayIndexOutOfBoundsException.

			System.out.println("Please provide valid array index to store the element into the array.");

		}catch(NegativeArraySizeException nase) { // Specific catch block to handle NegativeArraySizeException.

			System.out.println("Please don't provide negative size for an array.");

		}catch(Exception e) { // Generic catch block.

			System.out.println("Exception is handled.");
		}
		finally {

			System.out.println("Program execution is ended.");
		}

	}

}

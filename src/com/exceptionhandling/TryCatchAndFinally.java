package com.exceptionhandling;

import java.util.Scanner;

public class TryCatchAndFinally {

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
			
		}catch(Exception e) {
			e.printStackTrace(); // This catch block will handle all type of exceptions thrown by the try block.
		}finally {
			System.out.println("Program execution is ended.");
		}

	}

}

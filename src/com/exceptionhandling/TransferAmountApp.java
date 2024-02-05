package com.exceptionhandling;

import java.util.Scanner;

public class TransferAmountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to be withdrawn : ");
		int amount = sc.nextInt();
		try {
			// Calling the transfer() method which will throw custom exception.
			transfer(amount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void transfer(int amount) throws Exception{
		if(amount < 1000) {
			System.out.println("Amount is transfered.");
		}else {
			// Create object of custom exception and throwing it to the caller method.
			throw new InsufficientBalanceException();
		}
	}

}

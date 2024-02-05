package com.exceptionhandling;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException() {
		super("Amount is more than balance.");
	}

}

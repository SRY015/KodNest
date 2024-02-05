// Problem definition:-->
// Imagine you are working on a financial analytics platform. Your task is to create a function that identifies pairs of stocks for investment.
// The function should find two stocks from a given array, where the sum of their values matches a specified target investment amount.
// Each input will have exactly one valid solution, and the same stock cannot be used twice.
// You are given an array of integers representing the values of different stocks, and an integer representing the target investment amount.
// Write a Java program to find and return the indices of the two stocks that add up to the target amount.

import java.util.Scanner;
public class StockProblem {
	
	public static int[] twoSum(int arr[], int target) {
		int a[] = new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==target) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of stocks : ");
		
		// Taking the user input as String value and than separating the values with respect to spaces and storing into the String type array.
		String[] stock = sc.nextLine().split(" ");
		
		// Creating one int type array to store the stock values. The size of the array should be same as the string array.
		int arr[] = new int[stock.length];
		
		// Converting the string values into int and storing into int type array.
		for(int i=0;i<stock.length;i++) {
			arr[i] = Integer.parseInt(stock[i]);
		}
		
		// Taking the target value from the user.
		System.out.print("Enter the target value : ");
		int target = sc.nextInt();
		
		// Calling the function to find the indices of two stock whose sum is equal to target value.
		int res[] = twoSum(arr,target);
		
		// Printing the result.
		System.out.println("The indices of two stock whose sum is equal to target value = "+res[0]+" "+res[1]);
	}
}

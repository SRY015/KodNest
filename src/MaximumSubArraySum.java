import java.util.Scanner;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking User Input.
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		// Creating an array.
		int arr[] = new int[size];
		// Taking array elements.
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		// Calling the method to calculate maximum subarray sum.
		int maxSubarraySum = findMaxSubarraySum(arr);
		System.out.println("Maximum subarray sum = "+maxSubarraySum);

	}
	private static int findMaxSubarraySum(int[]arr) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int value: arr) {
			currentSum = Math.max(value, value+currentSum);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}

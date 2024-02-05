//If the sum of all the factors of a number except the number itself is equal to the number, then it is called as perfect number.
// Ex - factor of 6  = 1,2,3.
// Sum of all factors = 1+2+3 = 6 = the given number.
// therefore 6 is a perfect number.

import java.util.Scanner;
public class PerfectNumber {
	static boolean isPerfect(int n) {
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean res = PerfectNumber.isPerfect(num);
		if(res == true) {
			System.out.println(num+" is a perfect number");
		}else {
			System.out.println(num+" is not a perfect number");
		}
	}

}

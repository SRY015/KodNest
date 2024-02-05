// If the sum of the digits of a number is divide the number then it is called Harshed number.

import java.util.Scanner;
public class HarshedNumber {
	static int harsh(int m) {
		int sum = 0;
		while(m>0) {
			int rem = m%10;
			sum = sum + rem;
			m = m/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int m = num;
		int res = HarshedNumber.harsh(m);
		if(num % res == 0) {
			System.out.println(num+" is a harsh number.");
		}else {
			System.out.println(num+" is not a harsh number.");
		}

	}

}

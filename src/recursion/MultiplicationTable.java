package recursion;
import java.util.Scanner;
public class MultiplicationTable {
	public static void multuplication(int num, int s) {
		if(s > 10) {
			return;
		}else {
			System.out.println(num+" X "+s+" = "+(num*s));
			multuplication(num, s+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = 1;
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		multuplication(num,s);

	}

}

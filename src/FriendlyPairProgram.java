import java.util.Scanner;
public class FriendlyPairProgram {
	static int sumOfDivisor(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res1 = FriendlyPairProgram.sumOfDivisor(num1);
		int res2 = FriendlyPairProgram.sumOfDivisor(num2);
		if(res1/num1 == res2/num2) {
			System.out.println("Numbers are friendly pair");
		}else {
			System.out.println("Numbers are not friendy pair");
		}
	}

}

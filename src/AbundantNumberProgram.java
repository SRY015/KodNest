import java.util.Scanner;
public class AbundantNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(sum > num) {
			System.out.println(num+" is an abundant number");
		}else {
			System.out.println(num+" is a dificient number");
		}

	}

}

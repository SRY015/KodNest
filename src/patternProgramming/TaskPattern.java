package patternProgramming;
import java.util.Scanner;
public class TaskPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			int count = 65;
			for(int j=0;j<=i;j++) {
				char c = (char)count;
				System.out.print(c);
				if(j<=i/2) {
					count++;
				}else {
					count --;
				}
			}
			System.out.println();
		}

	}

}

package stringPrograms;
import java.util.Scanner;
public class UnicodeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char c = sc.next().charAt(0);
		int unicode = c;
		System.out.println("Unicode value of "+c+"is : "+unicode);
	}
}

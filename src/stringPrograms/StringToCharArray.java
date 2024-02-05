package stringPrograms;
import java.util.Scanner;
public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Reading the string from the user.
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		// Converting the string into char type array.
		char c[] = str.toCharArray();
		//Displaying the elements of char array.
		for(char a:c) {
			System.out.print(a+" ");
		}
	}

}

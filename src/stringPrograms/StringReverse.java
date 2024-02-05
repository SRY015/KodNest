package stringPrograms;
import java.util.Scanner;
public class StringReverse {
	public static String stringReverse(String s) {
		char arr[] = s.toCharArray();
		int len = arr.length;
		char c;
		for(int i=0;i<len/2;i++) {
			c = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = c;
		}
		String str = new String(arr);
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String res = stringReverse(s);
		System.out.println("Reverse string : "+res);
	}
}

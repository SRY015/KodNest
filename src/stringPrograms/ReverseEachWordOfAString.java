package stringPrograms;
import java.util.Scanner;
public class ReverseEachWordOfAString {
	public static String reverse(String s) {
		String str[] = s.split("\\s");
		StringBuffer bfr = new StringBuffer();
		for(int i=0;i<str.length;i++) {
			if(str[i].length() > 1) {
				bfr.append(reverseWord(str[i])+" ");
			}else {
				bfr.append(str[i]+" ");
			}
		}
		String str1 = new String(bfr);
		return str1.trim();
	}
	public static String reverseWord(String s) {
		char c[] = s.toCharArray();
		int len = c.length;
		char c1[] = new char[len];
		int count = 0;
		for(int i=len-1;i>=0;i--) {
			c1[count] = c[i];
			count++;
		}
		String str = new String(c1);
		//System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String res = reverse(str);
		System.out.println(res);
		
	}

}

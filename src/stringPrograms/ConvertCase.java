package stringPrograms;
import java.util.Scanner;

public class ConvertCase {
	public static String convertCase(String s) {
		char c[] = s.toCharArray();
		int len = c.length;
		for(int i=0;i<len;i++) {
			int ascii = c[i];
			if(ascii >= 65 && ascii <= 90) {
				c[i] = (char) (ascii + 32);
			}
			if(ascii >= 97 && ascii <= 122) {
				c[i] = (char) (ascii - 32);
			}
		}
		String s1 = new String(c);
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String res = convertCase(s);
		System.out.println(res);

	}

}

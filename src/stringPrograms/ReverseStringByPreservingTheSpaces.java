package stringPrograms;
import java.util.*;
public class ReverseStringByPreservingTheSpaces {
	public static String reverseString(String s) {
		char ch[] = s.toCharArray();
		String str = s.replace(" ", "");
		int len = ch.length;
		char arr[] = new char[len];
		for(int i=0;i<len;i++) {
			if(ch[i] == ' ') {
				arr[i] = ' ';
			}
		}
		int count = 0;
		for(int i=str.length()-1;i>=0;i--) {
			if(arr[count] == ' ') {
				count ++;
			}
			arr[count] = str.charAt(i);
			count++;
		}
		
		String sr = new String(arr);
		return sr.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String res = reverseString(str);
		System.out.println(res);

	}

}

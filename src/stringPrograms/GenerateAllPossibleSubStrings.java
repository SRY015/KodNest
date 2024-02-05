package stringPrograms;
import java.util.Scanner;
public class GenerateAllPossibleSubStrings {
	public static void subString(String s) {
		char arr[] = s.toCharArray();
		int len = arr.length;
		for(int i=0;i<len;i++) {
			String c = "";
			for(int j=i;j<len;j++) {
				c =c+arr[j];
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		subString(s);

	}

}

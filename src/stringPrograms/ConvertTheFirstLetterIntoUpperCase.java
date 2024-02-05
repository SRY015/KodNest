package stringPrograms;
import java.util.Scanner;
public class ConvertTheFirstLetterIntoUpperCase {
	public static String convert(String s) {
		char arr[] = s.toCharArray();
		int len = arr.length;
		for(int i=0;i<len;i++) {
			int ascii = arr[i];
			if(i == 0) {
				arr[i] = (char)(ascii - 32);
			}
			if(arr[i] == ' ') {
				int ascii1 = arr[i+1];
				arr[i+1] = (char)(ascii1 - 32);
			}if(arr[i] == '.') {
				arr[i] = (char)32;
			}
		}
		String s1 = new String(arr);

		return s1.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		String res = convert(s);
		System.out.println(res);


	}

}

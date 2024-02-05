package stringPrograms;
import java.util.Scanner;
public class RemoveDuplicateLetters {
	public static String removeDuplicate(String s) {
		char arr[] = s.toCharArray();
		int len = arr.length;
		char arr1[] = new char[len];
		for(int i=0;i<len;i++) {
			char c = arr[i];
			for(int j=i+1;j<len;j++) {
				if(c == arr[j]) {
					arr[j] = '0';
				}
			}
		}
		int count =0;
		for(int i=0;i<len;i++) {
			if(arr[i] != '0') {
				arr1[count] = arr[i];
				count ++;
			}
		}
		String str = new String(arr1);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.nextLine();
		String res = removeDuplicate(str);
		System.out.println(res);

	}

}

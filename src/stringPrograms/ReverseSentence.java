package stringPrograms;
import java.util.Scanner;
public class ReverseSentence {
	public static String reverseSen(String str) {
		String s[] = str.split("\\s");
		StringBuffer bfr = new StringBuffer();
		for(int i=s.length-1; i>=0; i--) {
			bfr.append(s[i]+" ");
		}
		String f = new String(bfr);
		return f.trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence : ");
		String str = sc.nextLine();
		String res = reverseSen(str);
		System.out.println(res);
	}

}

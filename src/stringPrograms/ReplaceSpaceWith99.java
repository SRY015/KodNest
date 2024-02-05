package stringPrograms;
import java.util.Scanner;
public class ReplaceSpaceWith99 {
	public static String replaceSpace(String s) {
		StringBuffer bfr = new StringBuffer();
		String[] words=s.split("\\s");//splits the string based on whitespace
		for(int i=0;i<words.length;i++) {
			if(i != words.length-1) {
			bfr.append(words[i]+"99");
			}else {
				bfr.append(words[i]);
			}
		}
		String str = new String(bfr);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String s1 = replaceSpace(s);
		System.out.println(s1);
	}

}

// Reverse each and every word in a string---->
import java.util.Scanner;
public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String st = sc.nextLine();
		String s[] = st.split(" ");
		String st2="";
		
		for(int i=0;i<s.length;i++) {
			int k = s[i].length()-1;
			char[] c = s[i].toCharArray();
			char[] c1 = new char[s[i].length()];
			
			for(int j=0;j<s[i].length();j++) {	
				
				c1[k] = c[j];
				k --;
			}
			String str = new String(c1);
			st2 = st2+" "+ str;
			
		}
		System.out.print("Reversed String = "+st2);
	}

}

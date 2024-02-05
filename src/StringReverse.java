//Reverse the string by preserving white space
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String st = sc.nextLine();
		
		// Converting the string into char array --->
		char[] ch = st.toCharArray();
		
		char[] ch1 = new char[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == ' ') {
				ch1[i] = ch[i];
			}
		}
		
		int j = ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != ' ') {
				if(ch1[j] == ' ') {
					j --;
				}
				ch1[j] = ch[i];
				j --;
			}
		}
		String str = new String(ch1);
		System.out.println("Reversed string =\n"+str);

	}

}

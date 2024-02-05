package stringPrograms;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		int res = s1.compareTo(s2);
		if(res > 0) {
			System.out.println("String s1 is greater.");
		}else if(res < 0) {
			System.out.println("String s2 is greater.");
		}else {
			System.out.println("Both Strings are equal.");
		}

	}

}

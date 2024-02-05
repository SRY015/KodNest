package stringPrograms;
public class SendIntoStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("KodNest");
		System.out.println(s1);
		String s2 = s1.intern();
		System.out.println(s2);
		String s3 = "KodNest";
		if(s3 == s2) {
			System.out.println("References are same");
		}else {
			System.out.println("References are not same.");
		}

	}

}

package stringPrograms;
import java.util.Scanner;
public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "KodNest Technologies Pvt Ltd";
		String upper = str.toUpperCase();
		System.out.println(upper); // KODNEST TECHNOLOGIES PVT LTD
		System.out.println(str.toLowerCase()); // kodnest technologies pvt ltd
		System.out.println(str.isEmpty()); //false
		System.out.println(str.charAt(3)); //N
		System.out.println(str.indexOf('T')); // 8
		System.out.println(str.indexOf('e')); //4
		System.out.println(str.lastIndexOf('e')); //18
		System.out.println(str.contains("Nest")); //true
		System.out.println(str.contains("Test")); //false
		System.out.println(str.startsWith("Kod")); //true
		System.out.println(str.indexOf('z')); //-1
		System.out.println(str.endsWith("Ltd")); //true
		System.out.println(str.substring(8)); //Technologies Pvt Ltd
		System.out.println(str.substring(8, 13)); // Techn
		System.out.println(str.replace('e', 'x')); //KodNxst Txchnologixs Pvt Ltd
		System.out.println(str.replaceAll("Technologies", "Company")); //KodNest Company Pvt Ltd

	}

}

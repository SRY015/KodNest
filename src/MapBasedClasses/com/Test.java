package MapBasedClasses.com;
import java.util.Scanner;

import com.jdbcDemo.DynamicInsert;
public class Test {
	
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String uname = sc.nextLine();
		System.out.println("Enter mail : ");
		String mail = sc.nextLine();
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		System.out.println("Enter gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter address : ");
		String address = sc.nextLine();
		
		try {
			//Calling the method --->
				boolean res = DynamicInsert.Insert(uname,mail,password,gender,address);
				if(res == true) {
					System.out.println("1 row inserted successfully !!");
				}
		}catch(Exception ex) {
				System.out.println("Problem is occured");
				ex.printStackTrace();
		}
		
	}
}


import java.util.Scanner;
public class AutoMorphic {
	static boolean isAutoMorphic(int num,int sqr) {
		while(num != 0) {
			if(num%10 != sqr%10) {
				return false;
			}
			num = num/10;
			sqr = sqr/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sqr = num * num;
		boolean res = AutoMorphic.isAutoMorphic(num,sqr);
		if(res == true) {
			System.out.println(num+" is an AutoMorphic Number");
		}else {
			System.out.println(num+" is not an Automorphic Number");
		}

	}

}

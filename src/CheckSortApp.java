import java.util.Scanner;
public class CheckSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the arrar : ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		boolean res = CheckSort.checkSort(arr);
		if(res) {
			System.out.println("Array is in sorted order.");
		}else {
			System.out.println("Array is not in sorted order.");
		}

	}

}

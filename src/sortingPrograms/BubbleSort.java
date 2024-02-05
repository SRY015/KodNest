package sortingPrograms;
import java.util.Scanner;
public class BubbleSort {
	public static void sort(int[] arr) {
		int len = arr.length;
		for(int i=0;i<=len-2;i++) {
			for(int j=0;j<=len-i-2;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
	}
}

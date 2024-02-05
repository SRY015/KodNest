package sortingPrograms;
import java.util.Scanner;
public class SelectionSort {
	public static void sort(int arr[]) {
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<len;j++) {
				if(min > arr[j]) {
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		System.out.println("Sorted array : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
	}
}

package sortingPrograms;

import java.util.Scanner;

public class InsertionSort {
	public static void sort(int arr[]) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		System.out.println("Sorted array : ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Insertion Sort---------");
		System.out.print("Enter the size of the array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);

	}

}

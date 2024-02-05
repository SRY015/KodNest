import java.util.Scanner;

import sortingPrograms.AllInOne;
public class AllInOneApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Please chose any one of the following options : ");
		System.out.println("1.Check whether array is sorted or not.\n2.Perform linear Search.\n3.Perform Binary Search.\n"
				+ "4.Perform Bubble Sort.\n5.Perform Insertion Sort.\n6.Perform selection Sort.\n7.Print Minimum element.\n"
				+ "8.Print Maximum element");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			AllInOne.isSorted(arr);
			break;
		case 2:
			AllInOne.linearSearch(arr);
			break;
		case 3:
			AllInOne.binarySearch(arr);
			break;
		case 4:
			AllInOne.bubbleSort(arr);
			break;
		case 5:
			AllInOne.insertionSort(arr);
			break;
		case 6:
			AllInOne.selectionSort(arr);
			break;
		case 7:
			AllInOne.minimumElement(arr);
			break;
		case 8:
			AllInOne.maximumElement(arr);
			break;
		default:
			System.out.println("Invalid Input !!");
			break;
		}

	}

}

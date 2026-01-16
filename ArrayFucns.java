package arrays;

import java.util.Scanner;

public class ArrayFucns {
	public static int[] addElementInIndex(int[] arr, int ele, int index) {
	    int[] arr1 = new int[arr.length + 1];
	    int j = 0;

	    for (int i = 0; i < arr1.length; i++) {
	        if (i == index) {
	            arr1[i] = ele;
	        } else {
	            arr1[i] = arr[j];
	            j++;
	        }
	    }
	    return arr1;
	}

	public static int[] replaceElementInIndex(int[] arr, int ele, int index) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			if (i == index) {
				arr1[i] = ele;
			} else {
				arr1[i] = arr[i];
			}
		}
		return arr1;
	}

	public static int[] removeElementFromIndex(int[] arr, int index) {
		int[] arr1 = new int[arr.length - 1];
		int flag = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (i == index) {
				flag++;
			} else {
				arr1[i] = arr[i + flag];
			}
		}
		return arr1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int ele = sc.nextInt();
		int index = sc.nextInt();

		int[] added = addElementInIndex(arr, ele, index);
		for (int i = 0; i < added.length; i++) {
			System.out.print(added[i] + " ");
		}
		System.out.println();

		int[] replaced = replaceElementInIndex(arr, ele, index);
		for (int i = 0; i < replaced.length; i++) {
			System.out.print(replaced[i] + " ");
		}
		System.out.println();

		int[] removed = removeElementFromIndex(arr, index);
		for (int i = 0; i < removed.length; i++) {
			System.out.print(removed[i] + " ");
		}

		sc.close();
	}

}

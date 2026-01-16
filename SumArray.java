package arrays;

import java.util.Scanner;

public class SumArray {

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public static String sum(String[] arr) {
		String sum="";
		for (String i : arr) sum+=i;
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] arr = new int[count];
		String[] arr1 = new String [count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("INTEGER");
		System.out.println(sum(arr));
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			arr1[i] = sc.nextLine();
		}
		System.out.println("STRINGS");
		System.out.println(sum(arr1));
		sc.close();
	}
}

package dsa;
import java.util.Arrays;
import java.util.Scanner;

public class Partition{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size = ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter "+size+" numbers of the array");
		for (int i=0;i<size;i++) {
			numbers[i] = sc.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println("Enter the values for X and Y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("User given "+size+" numbers are");
		System.out.println(Arrays.toString(numbers));
		int p = numbers[y] - numbers[y-1] -1;
		System.out.println("There are "+p+" number of numbers that satisfy the given condition");
		sc.close();
	}
}

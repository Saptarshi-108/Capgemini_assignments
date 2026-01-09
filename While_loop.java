package Java_training;

import java.util.Scanner;

// Write a program to create a calculator by using swtich case.
public class While_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int i=1;
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		i=n;
		while (i>0) {
			System.out.println(i);
			i--;
		}
	}
}

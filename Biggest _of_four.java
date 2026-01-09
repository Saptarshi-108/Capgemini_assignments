package Java_training;

import java.util.Scanner;

public class Biggest_of_four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int great = (a>b && a>c && a>d)?a:((b>c && b>d && b>a)?b:(c>a && c>b && c>d)?c:d);
		System.out.println(great);
		sc.close();
	}
}

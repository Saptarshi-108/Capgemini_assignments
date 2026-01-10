// Create a method to find the armstrong number. (153 = 1^3 + 5^3 + 3^3).

package Java_training;

import java.util.Scanner;

public class Armstrong {

	public static int power(int b, int p) {
		if (p == 0) {
			return 1;
		}
		if (p == 1) {
			return b;
		} else {
			return b * power(b, p - 1);
		}
	}

	public static int counter(int num) {
		int count = 0;

		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		int n = counter(num);
		int sum = 0;
		while (number > 0) {
			int b = number % 10;
			sum += power(b, n);
			number = number / 10;

		}
		if (sum == num) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}

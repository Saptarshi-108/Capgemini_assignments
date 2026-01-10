// Create a method ot return true if count of even and odd digits are same.

package Java_training;

import java.util.Scanner;

public class Count_checker {
	public static boolean count(long num) {
		int even = 0;
		int odd = 0;

		while (num != 0) {
			long digit = num % 10;
			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
		}

		if (even == odd) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(count(num));

	}
}

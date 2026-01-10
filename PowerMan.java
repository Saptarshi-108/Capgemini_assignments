// Create a function called power that takes power(int b,int p).

package Java_training;

import java.util.Scanner;

public class PowerMan {
	public static long power(int b, int p) {
		if (p==0) {
			return 1;
		}
		if (p==1) {
			return b;
		}
		else {
			return b*power(b,p-1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base =sc.nextInt();
		int exp = sc.nextInt();
		System.out.println(power(base,exp));
		
	}
}

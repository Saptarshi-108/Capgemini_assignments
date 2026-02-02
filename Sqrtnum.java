package dsa;
import java.util.Scanner;

public class Sqrtnum {
	// Write a program to calculate the square root of a perfect number.
	public static boolean perfectsquare(int n) {
		boolean ans=false;
		for (int i=0;i*i<=n;i++) {
			if (i*i==n) {
				ans=true;
				System.out.println(i+" is the number as square root of perfect square.");
				break;
			}
		}
		
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(perfectsquare(n));
	}
}

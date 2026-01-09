package Java_training;

import java.util.Scanner;

// Write a program to print odd numbers from n1 to n2.
public class Odnum_whileloop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc. nextInt();
		int i=n1;
		while (i<=n2) {
			if (i%2==1) {
				System.out.println(i + " is an odd number");
			}
			i++;
		}	
	}
}

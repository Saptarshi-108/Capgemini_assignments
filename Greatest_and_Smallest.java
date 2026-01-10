// take three integers and display greatest and smallest of the three.

package Java_training;

import java.util.Scanner;


public class Greatest_and_Smallest {
	public static void greatest(int a,int b, int c) {
		if (a>b && a>c) {
			System.out.println(a + " is the greatest number.");
		}
		if (b>a && b>c) {
			System.out.println(b + " is the greatest number.");
		}
		if (c>b && c>a) {
			System.out.println(c + " is the greatest number.");
		}
	}
	public static void smallest(int a,int b, int c) {
		if (a<b && a<c) {
			System.out.println(a + " is the smallest number.");
		}
		if (b<a && b<c) {
			System.out.println(b + " is the smallest number.");
		}
		if (c<b && c<a) {
			System.out.println(c + " is the smallest number.");
		}
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greatest(a,b,c);
        smallest(a,b,c);
        sc.close();
    }
}


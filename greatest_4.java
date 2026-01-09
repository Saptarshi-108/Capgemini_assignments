package Java_training;

import java.util.Scanner;

public class greatest_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    int c= sc.nextInt();
	    int d= sc.nextInt();
	    if (a>b && a>c && a>d) {
	    		System.out.println(a + " the greatest number");
	    }
	    if (b>a && b>c && b>d) {
	    	System.out.println(b + " the greatest number");
	    }
	    if (c>b && c>a && c>d) {
	    	System.out.println(c + " the greatest number");
	    }
	    if (d>b && d>c && d>a) {
	    	System.out.println(d + " the greatest number");
	    }
	}
}

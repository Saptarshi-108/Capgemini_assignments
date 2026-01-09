package Java_training;

import java.util.Scanner;

public class If_else_greatest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    int c= sc.nextInt();
	    if (a>b && a>c) {
	    		System.out.println(a+" is the greatest number.");
	    }
	    else {
	    		if (b>c && b>a) {
	    			System.out.println(b+" is the greatest number.");
	    		}
	    		else {
	    			System.out.println(c+" is the greatest number.");
	    		}
	    }
	}
}

package Java_training;

import java.util.Scanner;

public class digit_or_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    String valid = (input >=0 && input <=9)?"digit":"number";
	    System.out.println(valid);
	}
}

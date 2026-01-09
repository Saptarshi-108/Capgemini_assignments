package Java_training;

import java.util.Scanner;

public class Month_validity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    String valid = (month >0 && month <13)?"valid":"invalid";
    System.out.println(valid);
	}
}

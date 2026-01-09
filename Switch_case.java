package Java_training;

import java.util.Scanner;

// Write a program to create a calculator by using switch case.
public class Switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		switch (day) {
		case "Monday","Thursday","Wednesday":
			System.out.println("Bring English Book");
			break;
		case "Tuesday","Saturday":
			System.out.println("Bring Java Book");
		break;
		case "Friday":
			System.out.println("Bring SQL book");
		break;
		}
	}
}

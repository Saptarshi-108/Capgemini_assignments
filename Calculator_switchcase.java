package Java_training;

import java.util.Scanner;

// Write a program to create a calculator by using swtich case.
public class Calculator_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("no match");
        }
    }
}

//Write a calculator using method and case switch.

package Java_training;

import java.util.Scanner;

public class Solution {
	public static void Calculator(int a, int b, char c) {
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("no match");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);

		Calculator(a, b, c);
	}
}


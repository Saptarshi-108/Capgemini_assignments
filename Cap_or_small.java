package Java_training;

import java.util.Scanner;

public class Cap_or_small{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char te = sc.next().charAt(0);
		if ((int)te>=65 && (int)te <=91) {
			System.out.println(te + " is a Capital alphabet.");
		}
		else if ((int)te>=97 && (int)te <=123) {
			System.out.println(te + " is a Small alphabet.");
		}
		else {
			System.out.println("Not an alphabet.");
		}
		sc.close();
	}
}


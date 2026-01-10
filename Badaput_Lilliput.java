package Java_training;

import java.util.Scanner;

public class Badaput_Lilliput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char te = sc.next().charAt(0);
		if ((int)te>=65 && (int)te <=91) {
			System.out.println((char)(te+32) + " is the required Small alphabet.");
		}
		else if ((int)te>=97 && (int)te <=123) {
			System.out.println((char)(te-32) + " is the required Capital alphabet.");
		}

		sc.close();
	}
}

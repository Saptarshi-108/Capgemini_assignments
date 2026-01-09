//count how many even and odd digits present in the number.

package Java_training;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;
        }

        System.out.println(even);
        System.out.println(odd);
        sc.close();
    }
}



//Check whether a number is palindrome

package Java_training;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp = temp / 10;
        }

        if (number == reverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}

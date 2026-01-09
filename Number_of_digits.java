package Java_training;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        System.out.println(count);
        sc.close();
    }
}

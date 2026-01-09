//Find average of digits of a number

package Java_training;

import java.util.Scanner;

public class AvgDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (number != 0) {
            sum = sum + (number % 10);
            count++;
            number = number / 10;
        }

        double average = (double) sum / count;
        System.out.println(average);
        sc.close();
    }
}

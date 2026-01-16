package arrays;
import java.util.Scanner;

public class DigitSumArray {
    public static int digsum(int n) {
        int sum = 0;
        while (n > 0) {
            int b = n % 10;
            sum += b;
            n = n / 10;
        }
        return sum;
    }

    public static int[] digitsumarr(int arr[]) {
        int[] finalarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            finalarr[i] = digsum(arr[i]);
        }
        return finalarr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = digitsumarr(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}

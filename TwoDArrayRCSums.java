package arrays;

import java.util.Scanner;

public class TwoDarray {

    public static int[] rowWiseSum(int[][] arr) {
        int[] sum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = 0; j < arr[i].length; j++) {
                s += arr[i][j];
            }
            sum[i] = s;
        }
        return sum;
    }

    public static int[] columnWiseSum(int[][] arr) {
        int[] sum = new int[arr[0].length];

        for (int j = 0; j < arr[0].length; j++) {
            int s = 0;
            for (int i = 0; i < arr.length; i++) {
                s += arr[i][j];
            }
            sum[j] = s;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[] rowSum = rowWiseSum(a);
        int[] colSum = columnWiseSum(a);

        System.out.print("Row wise sum: ");
        for (int x : rowSum) {
            System.out.print(x + " ");
        }

        System.out.print("\nColumn wise sum: ");
        for (int x : colSum) {
            System.out.print(x + " ");
        }
    }
}

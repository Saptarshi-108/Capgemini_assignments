package arrays;

import java.util.Scanner;

public class RemoveDuplicatesArray {

    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = removeDuplicates(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}

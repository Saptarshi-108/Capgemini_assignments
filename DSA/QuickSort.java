package dsa;

import java.util.Scanner;

public class QuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;

        return j;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

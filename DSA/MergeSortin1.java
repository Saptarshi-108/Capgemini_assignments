package dsa;

import java.util.Arrays;

public class MergeSortin1 {

    public static int[] merge(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] res = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,6,2,134,23,87,12};
        int[] arr2 = {134,235,68,9,43,89,8,1,34,758};

        int[] arr = merge(arr1, arr2);

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[ " + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + " ]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}

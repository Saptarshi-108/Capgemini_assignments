
package dsa;

import java.util.ArrayList;
public class MaxSliding {
    public static ArrayList<Integer> maxsliding(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            res.add(max);
        }
        return res;
    }
    public static void main(String args[]) {
        int[] arr = {-1, 1, 3, 4, -2, 4, 6, 8};
        int k = 3;
        System.out.println(maxsliding(arr, k));
    }
}

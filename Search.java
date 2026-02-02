package dsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Search {

    public static void linear(int n, int element, ArrayList<Integer> list) {
        for (int i = 0; i < n; i++) {
            if (list.get(i) == element) {
                System.out.println("Linear Search: Found " + element + " at index " + i);
                return;
            }
        }
        System.out.println("Linear Search: Element not found");
    }

    public static void binary(int n, int element, ArrayList<Integer> list) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low +(high-low)/2;

            if (list.get(mid) == element) {
                System.out.println("Binary Search: Found " + element + " at index " + mid);
                return;
            } else if (list.get(mid) < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary Search: Element not found");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int element = sc.nextInt();

        linear(n, element, arr);

        Collections.sort(arr);
        binary(n, element, arr);
    }
}

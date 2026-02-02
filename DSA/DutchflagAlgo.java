package dsa;

public class DutchflagAlgo {

    public static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 2, 0, 0, 0, 1, 0, 1, 0, 1, 1 };

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, mid, start);
                mid++;
                start++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                swap(arr, mid, end);
                end--;
            }
        }

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

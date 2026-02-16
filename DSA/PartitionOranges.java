//Pratima and her son Pranav went to their garden and plucked the oranges.
//They got too many of them. So decided to sell some of them in the market.
// They decided to partition the oranges into 2 groups. Pranav took the last orange he plucked, then put all 
//the oranges smaller than the last orange in hand to bag A and the larger ones into bag B.
// Write a program to implement the solution and help Pranav partition into oranges. 
//The number of oranges say N is given as I/P. 
// Also the diameters of the oranges (assuming all the oranges are round/sphere) in mili meters are given.
// 2<=n<=2000
//40<=d<=100

package dsa;

import java.util.Scanner;

public class PartitionOranges {

    static void partition(int[] arr) {
        int n = arr.length - 1;
        int pivot = arr[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[j];
        arr[j] = arr[n];
        arr[n] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        partition(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

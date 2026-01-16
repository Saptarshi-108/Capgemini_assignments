// a=[1,2,3,4,5]
// b= [7,5,3]
// new_arr = [ 1,7,2,5,3,3,4,5]
// alternate element array.


package arrays;

import java.util.Scanner;

public class ZigzagArr {

	public static int[] zigzag(int a[], int b[]) {
		int[] res = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			res[k++] = a[i++];
			res[k++] = b[j++];
		}

		while (i < a.length) {
			res[k++] = a[i++];
		}

		while (j < b.length) {
			res[k++] = b[j++];
		}

		return res;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		int[] res = zigzag(a, b);

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}

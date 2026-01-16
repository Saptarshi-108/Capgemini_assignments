package arrays;

import java.util.Scanner;

public class TwoDarray{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		int[][] a = new int[2][3];
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}

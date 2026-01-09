package Java_training;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n=10;
		int i =0;
		int sum=0;
		do {
			sum+=i;
			i++;
		}
		while (i<=n);
		System.out.println(sum);
  }
}

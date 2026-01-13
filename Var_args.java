package Java_training;

import java.util.Scanner;

public class Var_args{
	public static void main(String args[]) {
		System.out.println();
		concatenate("bing","bang","boosh","bash","boom");
		System.out.println();
		biggest(1231,1423,564,756,7345);
		System.out.println();
	}
	
	public static void concatenate(String... ds) {
		String result="";
		for (String i:ds) {
			result+=i;
		}
		System.out.println(result);
	}
	
	public static void biggest(double... dl) {
		double max=0;
		for (double i : dl) {
			if (i>max) {
				max=i;
			}
		}
		System.out.println(max);
	}
}

package Java_training;

import java.util.Scanner;

public class  div_by_3_or_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int div3 = n%3;
	    int div5 =n%5;
	    String valid = (div3==0 && div5==0)?"Divisible by both 3 and 5":"not divisible";
	    System.out.println(valid);
	}
}

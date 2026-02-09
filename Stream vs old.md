# Old method
``` package dsa;

import java.util.ArrayList;
import java.util.List;

public class CustomOperation{
	public static List<Integer> filterOdd(int[] arr) {
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		for (int a:arr) {
			if (a%2==0) {
				evenArray.add(a);
			}
		}
		return evenArray;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(filterOdd(arr).toString());
	}
} 

# New method (Stream method)
``` 



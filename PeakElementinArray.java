package dsa;
//import java.util.ArrayList;
import java.util.Scanner;
public class PeakElementinArray {
	public static int peakelementinarray(int[] arr) {
		int peak=0;
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]<arr[i+1]) {
				peak=arr[i+1];
			}
		}
		return peak;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,8,9,10,16,12,4,2};
		System.out.println(peakelementinarray(arr));
	}
}

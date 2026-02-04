package dsa;

import java.util.HashSet;

//print the unique element.
public class SampleMap {
	public static void main(String args[]) {
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(arr));
	}

	public static int longestConsecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int globalCount = 0;
		
		for (int element : arr) {
			set.add(element);
		}

		for (int number : set) {
			if (!set.contains(number - 1)) {
				int currentNum = number;
				int count = 1;

				while (set.contains(currentNum+1)) {
					currentNum++;
					count++;
				}
				
				globalCount=Math.max(count, globalCount);
			}
		}
		return globalCount;
	}

}

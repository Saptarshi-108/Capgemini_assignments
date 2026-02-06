QUESTION 1: Heap Complexity Analysis (Conceptual)
a) Answer the following:
 
What is a heap?
 
Difference between Min Heap and Max Heap
 
Why heap is represented using an array
 
Time complexity of:
 
Insertion
 
Deletion
 
Heapify
 
Build Heap
 
Why is Build Heap = O(n) and not O(n log n)?
 
Answer in your own words (no copy-paste).
 
QUESTION 2: Working of Heap (Dry Run)
Problem Statement
 
Insert the following elements into a Max Heap in given order:
 
10, 20, 15, 30, 40
 
Tasks
 
Show heap after each insertion
 
Perform one deletion
 
Show heap after deletion
 
Explain heapify-up and heapify-down
 
QUESTION 3: Top K Frequent Elements
Problem Statement
 
Given an integer array, return the k most frequent elements.
 
Example
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
 
Constraints
 
Must use Heap
 
Better than O(n log n)
 
Tasks
 
Build frequency map
 
Use Min Heap of size k
 
Explain why Min Heap is used
 
Write Java code
 
QUESTION 4: Task Scheduler (Minimum Time Required)
Problem Statement
 
Given a list of tasks and cooldown n, find the minimum time required to finish all tasks.
 
Example
Input: tasks = [A,A,A,B,B,B], n = 2
Output: 8
 
Tasks
 
Explain the role of cooldown
 
Why we use Max Heap
 
Explain (n + 1) cycle logic
 
Write Java code using heap
 
Dry-run the example
 
QUESTION 5: Sliding Window Maximum
Problem Statement
 
Given an array and window size k, find the maximum element in each sliding window.
 
Example
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
 
Tasks
 
Solve using PriorityQueue
 
Explain why heap solution is O(n log k)
 
Java Code (PriorityQueue)
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});

            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                result.add(pq.peek()[0]);
            }
        }

        System.out.println(result);
    }
}

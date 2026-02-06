# Day 5 Assignment: Hashing

---

## Part A: Hashing Fundamentals

### 1. What is Hashing and why is it preferred over brute-force approaches?

Hashing is a technique that maps data (keys) to a fixed-size value using a hash function. This value is used as an index to store and retrieve data efficiently.

Hashing is preferred over brute-force approaches because:
- Brute force searching usually takes O(n) or O(n²) time.
- Hashing provides O(1) average-time complexity for insertion, deletion, and search.
- It significantly improves performance for problems involving lookups, frequency counting, grouping, and prefix sums.

Hashing trades extra memory for faster execution, which is acceptable in most real-world problems.

---

### 2. What is a Hash Table? Collision Handling Techniques

A Hash Table is a data structure that stores key–value pairs using a hash function to compute an index in an array.

A collision occurs when two different keys produce the same hash index.

Collision handling techniques:
- **Chaining**: Each index contains a linked list (or tree) of entries.
- **Open Addressing**:
  - Linear Probing
  - Quadratic Probing
  - Double Hashing

Java’s `HashMap` internally uses chaining and converts chains to balanced trees when collisions increase.

---

## Part B: Core Hashing Problems

---

## 1. Longest Consecutive Sequence (O(n))

```java
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest consecutive sequence length: " + longest);
    }
}

Group Anagrams
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        System.out.println(map.values());
    }
}

First Duplicate Element in an Array
import java.util.HashSet;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(n)) {
                System.out.println("First duplicate element: " + n);
                return;
            }
            set.add(n);
        }

        System.out.println("No duplicate found");
    }
}

Subarrays with Sum Exactly Equal to K
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int n : nums) {
            sum += n;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays: " + count);
    }
}

Smallest Window Containing All Characters of Another String
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) count--;
                map.put(c, map.get(c) - 1);
            }

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) + 1);
                    if (map.get(lc) > 0) count++;
                }
                left++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}


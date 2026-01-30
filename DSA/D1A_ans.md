**Section A: Arrays (Theory)**
1. What is an array?
An array is a data structure that stores multiple values of the same data type in contiguous memory locations. Each element is accessed using an index, starting from 0.

2. Difference between 1D array and 2D array

1D Array
Stores elements in a single linear sequence.
Uses one index.

2D Array
Stores elements in rows and columns (matrix form).
Uses two indices (row and column).

3. Traversing an array

Traversing means accessing each element of the array one by one, usually from index 0 to length - 1.

4. Inserting an element in an array

Since arrays are fixed-size, insertion requires:
Shifting elements to the right from the given position.
Placing the new element at the position.
Possible only if extra space exists.

5. Deleting an element from an array

Deletion involves:
Removing the element logically.
Shifting remaining elements to the left.
The array size remains the same, but one value is ignored.

6. Finding largest and smallest element

This is done by:
Assuming the first element as both largest and smallest.
Comparing each element and updating values accordingly.

7. Rotating an array to the left

Left rotation shifts elements to the left by d positions.
The first d elements move to the end.
Order of remaining elements is preserved.

8. Removing duplicates from a sorted array

In a sorted array:
Duplicate elements appear consecutively.
Compare adjacent elements and keep only unique ones.
Final array contains distinct elements in sorted order.

**Section B: Strings (Theory)**

1. What is a String in Java?
A String is an object that represents a sequence of characters. In Java, strings are stored as objects of the String class.

2. String immutability
Strings in Java are immutable, meaning:
Once created, their value cannot be changed.
Any modification creates a new String object.
This improves security, memory efficiency, and thread safety.

3. Basic string manipulations
Length: Number of characters in the string.
Uppercase/Lowercase: Changes character case.
Substring: Extracts a part of the string using indices.

4. Binary string
A binary string:
Contains only characters ‘0’ and ‘1’.
Any other character makes it non-binary.

5. Difference between substring and subsequence
Substring
Characters must be continuous.
Derived using start and end indices.
Example: from "abcde" → "bcd"
Subsequence
Characters need not be continuous.
Order must be preserved.
Example: from "abcde" → "ace"

6. Pattern searching in a string
Pattern searching checks whether a smaller string (pattern) exists within a larger string by comparing characters sequentially.

7. Palindrome string
A palindrome string:
Reads the same forward and backward.
Comparison is usually done between original and reversed string.

**Section C: Conceptual Questions**
1. What happens if array index is out of bounds?
Java throws an ArrayIndexOutOfBoundsException at runtime. The program terminates unless handled.

2. Time complexity of array traversal
O(n)
Each element is visited once.

3. Why are arrays fixed-size?
Because:
Memory is allocated at the time of array creation.
Size cannot be changed later.
This makes arrays fast but inflexible compared to dynamic data structures.

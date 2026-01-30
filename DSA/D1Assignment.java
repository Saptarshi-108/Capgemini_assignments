1. Create a 1D array and traverse it
class TraverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

2. Create a 2D array and display it in matrix format
  class MatrixDisplay {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

3. Insert an element at a given position
  import java.util.*;

class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos = 2;
        int val = 25;

        int[] res = new int[arr.length + 1];

        for (int i = 0; i < pos; i++)
            res[i] = arr[i];

        res[pos] = val;

        for (int i = pos; i < arr.length; i++)
            res[i + 1] = arr[i];

        System.out.println(Arrays.toString(res));
    }
}

4. Delete an element from a given position
  import java.util.*;

class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;

        int[] res = new int[arr.length - 1];

        for (int i = 0; i < pos; i++)
            res[i] = arr[i];

        for (int i = pos + 1; i < arr.length; i++)
            res[i - 1] = arr[i];

        System.out.println(Arrays.toString(res));
    }
}

5. Find largest and smallest element
class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 5, 9, 20, 3};

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

6. Rotate array left by d positions
import java.util.*;

class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++)
            res[i] = arr[(i + d) % n];

        System.out.println(Arrays.toString(res));
    }
}

7. Remove duplicates from a sorted array
class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int n = arr.length;

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++)
            System.out.print(arr[i] + " ");
    }
}

Section B: Strings (Programs)
1. Basic string manipulations
class StringOperations {
    public static void main(String[] args) {
        String s = "JavaProgramming";

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 4));
    }
}

2. Check whether a string is binary
class BinaryString {
    public static void main(String[] args) {
        String s = "1010101";
        boolean isBinary = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary ? "Binary String" : "Not Binary");
    }
}

3. Search for a pattern in a string
class PatternSearch {
    public static void main(String[] args) {
        String text = "Java is powerful";
        String pattern = "power";

        if (text.contains(pattern))
            System.out.println("Pattern found");
        else
            System.out.println("Pattern not found");
    }
}

4. Check whether a string is a palindrome
class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);

        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}



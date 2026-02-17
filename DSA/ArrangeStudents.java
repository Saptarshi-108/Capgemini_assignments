/*Arrange Students
A classroom has several students, half of whom are boys and half of whom are girls. You need to arrange all of them in a line for the morning assembly such that the following conditions are satisfied:

The students must be in order of non-decreasing height.
Two boys or two girls must not be adjacent to each other.
You have been given the heights of the boys in the array  and the heights of the girls in the array . Find out whether you can arrange them in an order which satisfies the given conditions. Print "YES" if it is possible, or "NO" if it is not.

For example, let's say there are  boys and  girls, where the boys' heights are  and the girls' heights are . These students can be arranged in the order , which is [2, 3, 4, 5, 6, 8]. Because this is in order of non-decreasing height, and no two boys or two girls are adjacent to each other, this satisfies the conditions. Therefore, the answer is "YES".

Input Format

The first line contains an integer, , denoting the number of test cases.

The first line of each test case contains an integer, , denoting the number of boys and girls in the classroom.

The second line of each test case contains  space separated integers, , denoting the heights of the boys.

The third line of each test case contains  space separated integers, , denoting the heights of the girls.

Constraints

Output Format

Print exactly  lines. In the  of them, print a single line containing "YES" if it is possible to arrange the students in the  test case, or "NO" if it is not.
*/
package dsa;
import java.util.*;

public class ArrangeStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] boys = new int[n];
            int[] girls = new int[n];

            for (int i = 0; i < n; i++) boys[i] = sc.nextInt();
            for (int i = 0; i < n; i++) girls[i] = sc.nextInt();

            Arrays.sort(boys);
            Arrays.sort(girls);

            boolean ok1 = check(boys, girls, true);
            boolean ok2 = check(boys, girls, false);

            System.out.println(ok1 || ok2 ? "YES" : "NO");
        }
        sc.close();
    }

    static boolean check(int[] boys, int[] girls, boolean startWithBoy) {
        int n = boys.length;
        int i = 0, j = 0;
        int prev = -1;

        for (int k = 0; k < 2 * n; k++) {
            int cur;
            if ((k % 2 == 0) == startWithBoy) {
                cur = boys[i++];
            } else {
                cur = girls[j++];
            }

            if (k > 0 && cur < prev) return false;
            prev = cur;
        }
        return true;
    }
}


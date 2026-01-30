1. Stack using Array
class StackArray {
    int[] stk;
    int top;

    StackArray(int n) {
        stk = new int[n];
        top = -1;
    }

    void push(int x) {
        if (top == stk.length - 1) return;
        stk[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return stk[top--];
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
    }
}

2. Queue using Array
class QueueArray {
    int[] q;
    int f = 0, r = -1;

    QueueArray(int n) {
        q = new int[n];
    }

    void enqueue(int x) {
        if (r == q.length - 1) return;
        q[++r] = x;
    }

    int dequeue() {
        if (f > r) return -1;
        return q[f++];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
    }
}

3. Reverse a String using Stack
import java.util.*;

class ReverseStringStack {
    public static void main(String[] args) {
        String s = "hello";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray())
            st.push(c);

        while (!st.isEmpty())
            System.out.print(st.pop());
    }
}

4. Palindrome Check using Stack
import java.util.*;

class PalindromeStack {
    public static void main(String[] args) {
        String s = "madam";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray())
            st.push(c);

        String r = "";
        while (!st.isEmpty())
            r += st.pop();

        System.out.println(s.equals(r));
    }
}

Level 2 – Intermediate
5. Stack using Deque
import java.util.*;

class StackDeque {
    Deque<Integer> d = new ArrayDeque<>();

    void push(int x) {
        d.push(x);
    }

    int pop() {
        return d.pop();
    }

    public static void main(String[] args) {
        StackDeque s = new StackDeque();
        s.push(5);
        s.push(10);
        System.out.println(s.pop());
    }
}

6. Evaluate Postfix Expression
import java.util.*;

class PostfixEval {
    public static void main(String[] args) {
        String exp = "23*54*+9-";
        Stack<Integer> st = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c))
                st.push(c - '0');
            else {
                int b = st.pop();
                int a = st.pop();
                if (c == '+') st.push(a + b);
                if (c == '-') st.push(a - b);
                if (c == '*') st.push(a * b);
                if (c == '/') st.push(a / b);
            }
        }
        System.out.println(st.pop());
    }
}

7. Circular Queue
class CircularQueue {
    int[] q;
    int f = 0, r = 0, c = 0;

    CircularQueue(int n) {
        q = new int[n];
    }

    void enqueue(int x) {
        if (c == q.length) return;
        q[r] = x;
        r = (r + 1) % q.length;
        c++;
    }

    int dequeue() {
        if (c == 0) return -1;
        int v = q[f];
        f = (f + 1) % q.length;
        c--;
        return v;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
    }
}

8. Simple Task Scheduler using Queue
import java.util.*;

class TaskScheduler {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Task1");
        q.add("Task2");
        q.add("Task3");

        while (!q.isEmpty())
            System.out.println("Executing " + q.poll());
    }
}

Level 3 – Advanced (Capgemini Level)
9. Next Greater Element
import java.util.*;

class NextGreater {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 25};
        Stack<Integer> st = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= a[i])
                st.pop();

            int ng = st.isEmpty() ? -1 : st.peek();
            System.out.println(a[i] + " -> " + ng);
            st.push(a[i]);
        }
    }
}

10. Min Stack (O(1) getMin)
import java.util.*;

class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> m = new Stack<>();

    void push(int x) {
        s.push(x);
        if (m.isEmpty() || x <= m.peek())
            m.push(x);
    }

    void pop() {
        if (s.pop().equals(m.peek()))
            m.pop();
    }

    int getMin() {
        return m.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        System.out.println(ms.getMin());
    }
}

11. First Non-Repeating Character in Stream
import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabc";
        int[] f = new int[256];
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            f[c]++;
            q.add(c);

            while (!q.isEmpty() && f[q.peek()] > 1)
                q.poll();

            System.out.println(q.isEmpty() ? -1 : q.peek());
        }
    }
}

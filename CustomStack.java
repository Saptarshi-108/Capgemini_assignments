package learnjava;

public class CustomStack {
    private int[] stack;
    private int top;
    private int size;

    public CustomStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(7);
        cs.push(6);
        cs.push(4);
        cs.push(7);
        cs.push(8);
        cs.push(14);
        cs.push(21);


        while (!cs.isEmpty()) {
            System.out.println(cs.pop());
        }
    }
}

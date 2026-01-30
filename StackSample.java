package learnjava;
import java.util.Scanner;
import java.util.Stack;

public class StackSample {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("The resulting stack is "+stack);
		System.out.println();
		
		while (!stack.empty()) {
			System.out.println(stack.pop()+" got popped from stack.");
		}
		System.out.println("The size of the stack is = "+stack.size());
	}
}

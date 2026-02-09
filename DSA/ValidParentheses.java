package dsa;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c =='('|| c =='{'|| c =='['){
				stack.push(c);
			}
			else {
				if(stack.isEmpty()){
					return false;
				}
				char top=stack.pop();
				if (c==')' && top!='(') {
					return false;
				}
				if (c=='}' && top!='{') {
					return false;
				}
				if (c==']' && top!='[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parenthesis = sc.nextLine();
		if (isValid(parenthesis)) {
			System.out.println("Valid parenthesis");
		}
		else {
			System.out.println("Not a valid one.");
		}
	}
}

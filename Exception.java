package exception;

public class Exception{
	public static void main(String arg[]) {
		int n = 10;
		int[] arr = { 23, 567, 76, 12, 80 };
		String s = null;
		String s1 = "gdfhgh";

		try {
			System.out.println(s.toLowerCase());
		} catch (NullPointerException e) {
			System.out.println("You cannot run operations on null value.");
		}

		try {
			System.out.println(n / 0);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}

		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The given array index is out of range for the given array.");
		}

		try {
			System.out.println(s1.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("The given string index is out of range for the given String.");
		}

		// ClassCastException
		try {
			Object obj = new StringBuilder(100);
			String str = (String) obj;
			System.out.println(str);
		} catch (ClassCastException e) {
			System.out.println("Invalid type casting performed.");
		}
	}
}

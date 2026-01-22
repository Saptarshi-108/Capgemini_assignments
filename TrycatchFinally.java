package exception;

public class TrycatchFinally {
	public static void m1() throws Exception{
		System.out.println("hii");
		System.out.println(7/0);
		System.out.println("bye");
	}
	public static void main(String arg[]) {
		System.out.println("hii");
		try {
			m1();
		}catch(Exception e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("finally closing");
		}
	}
}

package oops;

public class Encapsulation {
	String name;
	private int password;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String args[]) {
		Encapsulation s = new Encapsulation();
		s.name = "Raju";
		s.setPassword(123);
		System.out.println(s.name);
		System.out.println(s.getPassword());
		

	}
}

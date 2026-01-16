package oops; 

class Parent{
	public void home() {
		System.out.println("blue");
	}
	public static void home2() {
		System.out.println("Parent static method");
	}
}
public class Child extends Parent{
  @Override
	public void home() {
		System.out.println("red");
	}
	public static void home2() {
		System.out.println("Child static method");
	}
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String args[]) {
		Parent p = new Parent();
		p.home();
		Child c = new Child();
		c.home();
		c.bike();
		Parent p2 = new Child();
		p.home(); //Child 
		p.home2(); //Parent
	}
}

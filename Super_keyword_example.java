// Parent.java 
package oops;

public class Parent{
	String name;
	
	public Parent(String name) {
		this.name = name;	
	}
}
//Child.java

package oops; 

public class Child extends Parent{
	long phone;
	
	public Child(String name, long phone) {
		super(name);
		this.phone=phone;
	}
	public static  void main(String args[]) {
		Child c= new Child("Kaiju",4642345);
		System.out.println(c.name);
		System.out.println(c.phone);
	}
}

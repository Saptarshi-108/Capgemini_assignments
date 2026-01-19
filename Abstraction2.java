//PersonDriver.java
package abstraction;

public class PersonDriver {
	public static void main(String args[]) {
		Person p = new Person();
		p.setV(new Car());
		p.setV(new Bike());
		
		Vehicle v2 = p.getV();
		v2.type();
		v2.price();
	}
}

//Vehicle.java
package abstraction;

interface Vehicle {
	void price();
	void type();
	
}
class Car implements Vehicle{
	@Override
	public void price() {
		System.out.println("30 lakhs");
	}
	@Override
	public void type() {
		System.out.println("Electric");
	}
}
class Bike implements Vehicle{
	@Override
	public void price() {
		System.out.println("5 lakhs");
	}

	@Override
	public void type() {
		System.out.println("Petrol");
	}
}

//Person.java
package abstraction;

public class Person {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}
	
	public void setV(Vehicle v) {
		this.v = v;
	}

}

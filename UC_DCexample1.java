package oops;

class Vehicle{
	public void travels() {
		System.out.println("Happy travels, don't walk use a vehicle.");
	}
}
class Car extends Vehicle{
	public void noOfPassenger() {
		System.out.println("The number of passengers that is allowed is 40.");
	}
}
class Bike extends Vehicle{
	public void speedmax() {
		System.out.println("The maximum speed is 70kmph");
	}
}
class Train extends Vehicle{
	public void ticketPassengers() {
		System.out.println("The train ticket is Rs. 1400");
	}
}
public class Test{
	public static void main(String args[]) {
		
		Vehicle v1 = new Car(); //UC Car
		v1.travels();
		v1 = new Bike(); // UC bike
		Bike b =(Bike) v1; //DC
		b.travels();
		b.speedmax();
		
	}
}

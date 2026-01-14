package oops;

public class Vehicle{
	String brand;
	String color;
	double price;
	
	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Bike b = new Bike("BMW","black",150);
		b.printVehicle();
		Vehicle v = new Vehicle();
		v.brand="honda";
		v.color="red";
		v.price=100000;
		v.printVehicle();
	}
}

class Bike extends Vehicle{
	
	Bike(String brand, String color, double price){
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
}

package oops;

class Product{
	String brand;
	public Product(String brand){
		this.brand=brand;
	}
}
class Mobile extends Product{
	double price;
	String sim;
	public Mobile(String brand,double price, String sim) {
		super(brand);
		this.price=price;
		this.sim = sim;	

	}
	public void printMobile(Mobile m) {
		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.sim);		
	}
}
class Laptop extends Product{
	double price;
	String processor;
	public Laptop(String brand,double price, String processor) {
		super(brand);
		this.price=price;
		this.processor=processor;
	}
	public void printLaptop(Laptop l) {
		System.out.println(l.brand);
		System.out.println(l.price);
		System.out.println(l.processor);		
	}
	
}
public class Test{
	public static void main(String args[]) {
		Laptop l = new Laptop("DELL",46165.68,"DRR5");
		Mobile m = new Mobile ("SAMSUNG",451561.84,"AIRTEL");
		l.printLaptop(l);
		m.printMobile(m);
	}
}

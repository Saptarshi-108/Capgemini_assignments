package Java_training;

public class Product {
	int id;
	String name;
	double price;
	int ratings;

	public Product() {
		System.out.println("NOTHING");
	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Product(int id, String name, double price, int ratings) {
		this.id = id;
		this.name = name;
		this.price=price;
		this.ratings=ratings;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ratings);
	}
	public static void main(String args[]) {
		Product p1= new Product();
		p1.display();
		Product p2= new Product(101,"Pressure Cooker");
		p2.display();
		Product p3= new Product(243,"Refrigerator",56564.26,3);
		p3.display();
	}
}

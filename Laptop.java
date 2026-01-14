

package Java_Core;

import java.util.Scanner;

public class Laptop {
	String brand;
	double price;

	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void comparePrice(Laptop laptop) {
		if (this.price > laptop.price) {
			System.out.println(this.brand + " is costly");
		} else if (this.price < laptop.price) {
			System.out.println(laptop.brand + " is costly.");
		} else {
			System.out.println("Both laptops have sam cost");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first laptop brand: ");
		String brand1 = sc.nextLine();
		System.out.print("Enter first laptop price: ");
		double price1 = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter second laptop brand: ");
		String brand2 = sc.nextLine();
		System.out.print("Enter second laptop price: ");
		double price2 = sc.nextDouble();

		Laptop l1 = new Laptop(brand1, price1);
		Laptop l2 = new Laptop(brand2, price2);

		l1.comparePrice(l2);
	}
}


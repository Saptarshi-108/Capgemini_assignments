package Java_training;

import java.util.Scanner;

public class Laptop {
    int brand;
    double price;

    public static void comparePrice(Laptop l1, Laptop l2) {
        if (l1.price > l2.price) {
            System.out.println("Laptop 1 is more expensive");
        } else if (l1.price < l2.price) {
            System.out.println("Laptop 2 is more expensive");
        } else {
            System.out.println("Both laptops have the same price");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop[] laptops = new Laptop[2];

        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = new Laptop();

            System.out.println("Enter brand (as number) for laptop " + (i + 1) + ":");
            laptops[i].brand = sc.nextInt();

            System.out.println("Enter price for laptop " + (i + 1) + ":");
            laptops[i].price = sc.nextDouble();
        }

        comparePrice(laptops[0], laptops[1]);

        sc.close();
    }
}

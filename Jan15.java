package oops;
class Vehicle {
    private String color;

    void setColor(String c) {
        color = c;
    }

    String getColor() {
        return color;
    }
}

class Bike extends Vehicle {
    private String brand;
    private double price;

    void setBike(String b, double p) {
        brand = b;
        price = p;
    }

    void show() {
        System.out.println("Bike " + getColor() + " " + brand + " " + price);
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.setColor("Red");
        b.setBike("Honda", 90000);
        b.show();

        Car c = new Car();
        c.setColor("Black");
        c.setCar("Toyota", 1200000);
        c.show();
    }
}

class Car extends Vehicle {
    private String brand;
    private double price;

    void setCar(String b, double p) {
        brand = b;
        price = p;
    }

    void show() {
        System.out.println("Car " + getColor() + " " + brand + " " + price);
    }
}

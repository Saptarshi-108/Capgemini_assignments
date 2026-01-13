package Java_training;

import java.util.Scanner;

public class Constructor_Overloading {
	int id;
	String name;

	public Student() {
		System.out.println("Constructor");
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String args[]) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(10, "Raju");
		s2.display();
	}
}

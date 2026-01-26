//abstraction, inheritance.
package oops;
//import java.lang.Double;
import java.util.ArrayList;
import java.util.Scanner;
	
public class StudentDriver {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Student> list = new ArrayList<>();

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter id: ");
	            long id = sc.nextLong();

	            System.out.print("Enter name: ");
	            String name = sc.next();

	            System.out.print("Enter marks: ");
	            double marks = sc.nextDouble();

	            list.add(new CollegeStudent(id, name, marks));
	        }

	        Student[] arr = list.toArray(new Student[0]);

	        list.get(0).passmarks(arr);
	        list.get(0).topper(arr);

	        System.out.print("Enter name to search: ");
	        String searchName = sc.next();
	        list.get(0).studsearch(arr, searchName);

	        list.get(0).passcount(arr);

	        sc.close();
	}
}
class CollegeStudent extends Student{
	public CollegeStudent(long id, String name, double marks) {
		super(id,name,marks);
	}
}

abstract class Student{
	private long id;
	private String name;
	private double marks;
	public Student(long id, String name, double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return name;
		
	}
	public void passmarks(Student[] arr) {
		for (Student i:arr) {
			if (i.marks>=40) {
				System.out.println("id: "+i.id+ " name: "+i.name+" marks: "+i.marks);
			}
		}
	}
	public void topper(Student[] arr) {
		double maxMarks=0;
		Student s1 = null;
		for (Student i: arr) {
			if (i.marks>=maxMarks) {
				s1=i;
				maxMarks=i.marks;
			}
		}
		System.out.println("The topper is "+s1.name);
	}
	public void studsearch(Student[] arr, String name) {
		for (Student i:arr) {
			if (i.name.equals(name)) {
				System.out.println("The details of the student is - "+i.id+" "+i.name+" "+i.marks);
				break;
			}
		}
	}
	public void passcount(Student[] arr) {
		int count=0;
		for (Student i:arr) {
			if (i.marks>=40) {
				count++;
			}
		}
		System.out.println("The number of students that passed : "+count);
		
	}
}

package Java_training;

public class Student {
	int id;
	String name;
	long phone;
	public Student(int id) {
		this.id=id;
	}
	public Student(int id,String name) {
		this(id);
		this.name=name;
	}
	public Student(int id,String name, long phone) {
		this(id,name);
		this.phone=phone;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println("-------------------");		
	}
	public static void main (String args[]) {
		Student s1= new Student(11,"xyz",888);
		s1.display();
		Student s2 = new Student(10,"Raju");
		s2.display();
		Student s3 = new Student(12);
		s3.display();
	}
}

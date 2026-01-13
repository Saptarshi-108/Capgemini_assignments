package Java_training;

public class ThisKeyword {
	int id=100;
	String name="Anil";
	
	public void initialize(int id, String name) {
		System.out.println(name); //local
		System.out.println(id);  //local
		System.out.println(this.name); //NS
		System.out.println(this.id); //NS
	}
	public static void main(String args[]) {
		Student s= new Student();
		s.initialize(10,"Mukesh");
	}

}

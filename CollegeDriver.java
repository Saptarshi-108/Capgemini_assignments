package oops;

class College{
	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer=trainer;
	}
	public void printCollege() {
		System.out.println("------------------------------College-------------------------------");
		System.out.println(name);
		System.out.println(location);
		System.out.println("------------------------------Student-------------------------------");
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println("------------------------------Trainer-------------------------------");
		System.out.println(trainer.getSubject());
		System.out.println(trainer.getName());
	}
	
}
class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Trainer {
	private String name;
	private String subject;
	private Student student;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student getS() {
		return student;
	}

	public void setS(Student student) {
		this.student = student;
	}
}

public class CollegeDriver {
	public static void main(String args[]) {
		Student s = new Student();
		s.setId(10);
		s.setName("raju");
		
		Trainer t = new Trainer();
		t.setName("digo");
		t.setSubject("computer");
		t.setS(s);
		
		College c = new College();
		c.setName("IEM");
		c.setLocation("college more");
		c.setStudent(s);
		c.setTrainer(t);
		
		c.printCollege();
	}
}

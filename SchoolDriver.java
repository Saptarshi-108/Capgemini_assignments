package StudentManagmentSystem;

class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

Student extends Person {
	private int rollNumber;
	private double grade;
	private Course c ;
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
}

class Course {
	private int courseId;
	private String courseName;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}

class StudentCourse {
	public static void showStudentCourseDetails(Student s){
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getC().getCourseId());
		System.out.println(s.getC().getCourseName());
	}
}

public class SchoolDriver {
	public static void main(String args[]) {

		Student s = new Student();
		Course c = new Course();

		s.setName("Raju");
		s.setAge(14);
		s.setRollNumber(234);

		c.setCourseId(56);
		c.setCourseName("Computer Science");

		s.setC(c);

		StudentCourse.showStudentCourseDetails(s);
	}
}

package dsa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

class Employee {
	private int employeeId;
	private String employeeName;
	private String gender;
	private LocalDate dateOfBirth;
	private int experience;
	private String email;
	private long phoneNumber;

	public Employee(int employeeId, String employeeName, String gender, LocalDate dateOfBirth, int experience,
			String email, long phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.experience = experience;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode() invoked");
		return Objects.hash(dateOfBirth, email, employeeId, employeeName, experience, gender, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() invoked");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& experience == other.experience && Objects.equals(gender, other.gender)
				&& phoneNumber == other.phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", experience=" + experience + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

}

public class SampleHashing {
	public static void main(String args[]) {
		HashSet<Employee> employees = new HashSet<>();

		employees.add(
				new Employee(1, "Mark", "male", LocalDate.of(1990, 11, 21), 5, "gantimparusa@gmail.com", 987652344));
		employees.add(
				new Employee(2, "Sarah", "female", LocalDate.of(1988, 5, 14), 7, "sarah.johnson@email.com", 987654321));

		employees.add(new Employee(3, "Raj", "male", LocalDate.of(1995, 9, 22), 3, "raj.patel@work.com", 987654322));

		employees.add(
				new Employee(4, "Emily", "female", LocalDate.of(1992, 3, 7), 4, "emily.davis@gmail.com", 987654323));

		employees.add(
				new Employee(5, "Ahmed", "male", LocalDate.of(1985, 12, 30), 10, "ahmed.khan@corp.com", 987654324));

		employees.add(
				new Employee(6, "Lisa", "female", LocalDate.of(1991, 7, 18), 6, "lisa.wilson@outlook.com", 987654325));
		employees.add(
				new Employee(6, "Lisa", "female", LocalDate.of(1991, 7, 18), 6, "lisa.wilson@outlook.com", 987654325));
		employees.add(
				new Employee(7, "David", "male", LocalDate.of(1987, 1, 5), 8, "david.miller@company.com", 987654326));
	System.out.println(employees);
	}
}

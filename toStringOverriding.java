package assessments;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	Employee(int id, String name,double salary, String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	@Override
	public String toString() {
		return "id: "+id+" name: "+name+" salary: "+salary+" department: "+department;
	}
	public static void main(String args[]) {
		Employee e1 = new Employee(10,"raju",35345.53,"HR");
		Employee e2 = new Employee(11,"kaju",353651.3,"CA");
		Employee e3 = new Employee(12,"paju",98353651.3,"Managements");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
}

// Weak HAS-A relationship

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class College {
    private Student student;

    College(Student student) {
        this.student = student;
    }
}

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }
}

class Department {
    private Employee emp;

    Department(Employee emp) {
        this.emp = emp;
    }
}

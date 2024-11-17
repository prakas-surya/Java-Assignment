package assignment;

class Student {
	String name;
	String email;
	
	public Student() {
		this.name = "unknown";
		this.email = "unknown";
		System.out.println("Parent Class : ");
		System.out.println("Parameterless constructor is called...");
		displayDetails();
	}
	
	public Student(String name, String email) {
		this.name = name;
		this.email = email;
		System.out.println("Parent Class : ");
		System.out.println("Parameterized constructor is called...");
		displayDetails();
	}
	
	private void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("email : " + email);
	}
}

class ZSGSStudent extends Student {
	String department;
	
	public ZSGSStudent() {
		super();
		this.department = "unknown";
		System.out.println("Child Class");
		System.out.println("Parameterless constructor is called...");
		displayDepartment();
	}
	
	public ZSGSStudent(String name, String email, String department) {
		super(name, email);
		this.department = department;
		System.out.println("Child Class");
		System.out.println("Parameterized constructor is called...");
		displayDepartment();
	}
	
	private void displayDepartment() {
		System.out.println("Department : " + department);
	}
}

public class ZSGS {

	public static void main(String[] args) {
		// parameter less constructor called
		new ZSGSStudent();
		
		// parameterized constructor is called
		System.out.println();
		new ZSGSStudent("John", "john@email.com", "Computer Science");

	}

}

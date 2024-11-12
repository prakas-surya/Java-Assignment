package assignment;

public class EmployeeDTO {
	private String name;
	private int employeeId;
	private String project;
	private String reportingPerson;
	private int age;
	private String phoneNumber;
	private String address;
	
	// assuming 100 since i'm using array here
	private static EmployeeDTO[] employees = new EmployeeDTO[100];
	private static int noOfEmployees = 0;
	
	public EmployeeDTO(String name, int employeeId, String project, String reportingPerson, int age, String phoneNumber, String address) {
		this.name = name;
		this.employeeId = employeeId;
		this.project = project;
		this.reportingPerson = reportingPerson;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
		addEmployee(this);
	}
	
	private static void addEmployee(EmployeeDTO employee) {
		if (noOfEmployees < employees.length) {
			employees[noOfEmployees++] = employee;
		} else {
			System.out.println("Employee List is Full, cannot add more Employees!");
		}
	}
	
	public static int totalNoOfEmployees() {
		return noOfEmployees;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public void setReportingPerson(String reportingPerson) {
		this.reportingPerson = reportingPerson;
	}
	
	public String getReportingPerson() {
		return reportingPerson;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Project: " + project);
        System.out.println("Reporting Person: " + reportingPerson);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age : " + age);
        System.out.println("Address:" + address);
	}
	
	public static void displayAllEmployees() {
		System.out.println("Employee List:");
	    for (int i = 0; i < noOfEmployees; i++) {
	    	System.out.println("Employee " + (i + 1) + ":");
	        employees[i].displayEmployeeDetails();
	        System.out.println();
        }
	    System.out.println("Total Employees: " + noOfEmployees);
	}
}

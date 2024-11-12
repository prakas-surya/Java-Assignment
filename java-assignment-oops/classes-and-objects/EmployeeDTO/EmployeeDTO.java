package assignment;

public class EmployeeDTO {
	private String name;
	private int employeeId;
	private String project;
	private String reportingPerson;
	private int age;
	private String phoneNumber;
	private String address;
	
	static int noOfEmployees = 0;
	
	public EmployeeDTO(String name, int employeeId, String project, String reportingPerson, int age, String phoneNumber, String address) {
		this.name = name;
		this.employeeId = employeeId;
		this.project = project;
		this.reportingPerson = reportingPerson;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		noOfEmployees++;
	}
	
	public int totalNoOfEmployees() {
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
        System.out.println("Total Employees : " + noOfEmployees);
	}
}

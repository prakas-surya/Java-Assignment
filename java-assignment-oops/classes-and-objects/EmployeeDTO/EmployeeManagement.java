package assignment;

public class EmployeeManagement {

	public static void main(String[] args) {
		EmployeeDTO employee1 = new EmployeeDTO("John", 1665, "Project1", "Cena", 25, "9999999999", "Chennai");
		EmployeeDTO employee2 = new EmployeeDTO("Joe", 1668, "Project2", "Will", 27, "888888888", "Chennai");
		
		// get employee details : 
		System.out.println("Get Employee Details :");
		System.out.println("Name : " + employee1.getName());
		System.out.println("ID : " + employee1.getEmployeeId());
		System.out.println("Reporting person  : " + employee1.getReportingPerson());
		System.out.println("Age : " + employee1.getAge());
		System.out.println("Phone Number : " + employee1.getPhoneNumber());
		System.out.println("Location : " + employee1.getAddress());
		System.out.println("No of Employees : " + employee1.totalNoOfEmployees());
		
		//update employee2 details
		employee2.setName("Employee2");
		employee2.setEmployeeId(1669);
		employee2.setReportingPerson("Phil");
		employee2.setAge(46);
		employee2.setPhoneNumber("7777777777");
		employee2.setAddress("Madurai");
		
		// display employee details
		System.out.println();
		employee2.displayEmployeeDetails();
	}

}

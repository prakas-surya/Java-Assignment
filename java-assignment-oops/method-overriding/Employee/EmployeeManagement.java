package javaTest;

public class EmployeeManagement {
	
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1665, "Project1", "Cena", 25, "9999999999", "Chennai");
        HourlyEmployee employee2 = new HourlyEmployee("Joe", 1666, "Project2", "Phil", 30, "8888888888", "Madurai", 20.5, 40);
        SalariedEmployee employee3 = new SalariedEmployee("Alice", 1667, "Project3", "Jane", 35, "7777777777", "Coimbatore", 75000);

        Employee[] employees = {employee1, employee2, employee3};

        for (Employee employee : employees) {
            System.out.println("\nEmployee Details:");
            employee.getEmployeeDetails();
        }
    }
}


package javaTest;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int employeeId, String project, String reportingPerson, int age, String phoneNumber, String address, double annualSalary) {
        super(name, employeeId, project, reportingPerson, age, phoneNumber, address);
        this.annualSalary = annualSalary;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Annual Salary: " + annualSalary);
    }
}


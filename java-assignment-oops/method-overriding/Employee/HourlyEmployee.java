package javaTest;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int employeeId, String project, String reportingPerson, int age, String phoneNumber, String address, double hourlyRate, int hoursWorked) {
        super(name, employeeId, project, reportingPerson, age, phoneNumber, address);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + (hourlyRate * hoursWorked));
    }
}


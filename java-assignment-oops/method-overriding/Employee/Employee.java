package javaTest;

public class Employee {
    private String name;
    private int employeeId;
    private String project;
    private String reportingPerson;
    private int age;
    private String phoneNumber;
    private String address;

    public Employee(String name, int employeeId, String project, String reportingPerson, int age, String phoneNumber, String address) {
        this.name = name;
        this.employeeId = employeeId;
        this.project = project;
        this.reportingPerson = reportingPerson;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getProject() {
        return project;
    }

    public String getReportingPerson() {
        return reportingPerson;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void getEmployeeDetails() {
        System.out.println("General Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Project: " + project);
        System.out.println("Reporting Person: " + reportingPerson);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}


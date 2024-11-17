package dynamic;

import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    public double calculatePay() {
        return annualSalary / 12;
    }

    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Annual Salary: " + annualSalary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Enter name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter type (1 for Hourly, 2 for Salaried): ");
            int type = scanner.nextInt();

            if (type == 1) {
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                int hoursWorked = scanner.nextInt();
                employees[i] = new HourlyEmployee(name, id, hourlyRate, hoursWorked);
            } else if (type == 2) {
                System.out.print("Enter annual salary: ");
                double annualSalary = scanner.nextDouble();
                employees[i] = new SalariedEmployee(name, id, annualSalary);
            } else {
                System.out.println("Invalid type. Skipping this employee.");
                i--;
            }
        }

        System.out.println("\nEmployee Details and Pay:");
        for (Employee employee : employees) {
            if (employee != null) {
                employee.getEmployeeDetails();
                System.out.println("Calculated Pay: " + employee.calculatePay());
                System.out.println();
            }
        }

        scanner.close();
    }
}

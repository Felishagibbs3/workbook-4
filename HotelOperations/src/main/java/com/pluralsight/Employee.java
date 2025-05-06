package com.pluralsight;

public class Employee {
    private String name;
    private int employeeID;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(String name, int employeeID, String department, double payRate, int hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public double getTotalPay() {

        return payRate * hoursWorked;
    }
}

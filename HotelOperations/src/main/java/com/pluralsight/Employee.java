package com.pluralsight;

public class Employee {
    private String name;
    private int employeeID;
    private String department;
    private double payRate;
    private int hoursWorked;
    private double startTime;

    public Employee(String name, int employeeID, String department, double payRate, int hoursWorked) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = Double.parseDouble(null);
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

        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }
    public double getRegularHours() {

        return Math.min(40, hoursWorked);
    }
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

   }


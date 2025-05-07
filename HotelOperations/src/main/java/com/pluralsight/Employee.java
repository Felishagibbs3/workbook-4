package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    public void punchIn() {
        LocalDateTime current = LocalDateTime.now();
        double time = current.getHour() + current.getMinute() / 60.0;
        this.startTime = time;
    }
    public void punchOut() {
        LocalDateTime current = LocalDateTime.now();
        double time = current.getHour() + current.getMinute() / 60.0;

        if (time >= this.startTime) {
            double work = time - this.startTime;
            this.hoursWorked += work;
        } else {
            System.out.println("Error: Punch out is earlier than punch in.");
        }
    }
    public void punchIn(double time) {
        this.startTime = time;
        System.out.println("punched in at" + LocalDateTime.now());
    }
    public void punchOut (double time) {
        if (time >= startTime) {
            double work = time - startTime;
            this.hoursWorked += work;
        } else {
            System.out.println("Error: Punch out time is earlier than punch in time");
        }
    }
    public void timeCard(double time, boolean isPunchIn) {
        if (isPunchIn) {
            this.punchIn(time);
        } else {
            this.punchOut(time);
        }
    }

   }


package com.pluralsight;

import java.time.LocalDateTime;

public class HotelApp {
    public static void main(String[] args) throws Exception {
        Reservation hoteReservation = new Reservation();
        hoteReservation.setRoomType("Double");
        hoteReservation.setNumOfNights(2);
        hoteReservation.setWeekend(true);

        System.out.println("Type of Room: " + hoteReservation.getRoomType());
        System.out.println("Price per Night: " + hoteReservation.getPrices());
        System.out.println("Total Cost of Reservation: " + hoteReservation.getReservationTotalPrice());

        System.out.println("--------------------");

        Room room1 = new Room(2, 124, true,true);
        Room room2 = new Room(1, 130, false,true);

        System.out.println("Is room 1 available? " + room1.isDirty());
        System.out.println("Is room 2 available? " + room2.isDirty());

        System.out.println("--------------------");


        Employee employee1 = new Employee("Danyelle G", 24567, "IT", 30, 40);
        System.out.println("Name  : " + employee1.getName());
        System.out.println("Employee ID   : " + employee1.getEmployeeID());
        System.out.println("Department  : " + employee1.getDepartment());
        System.out.println("Pay Rate  : $ " + employee1.getPayRate());
        System.out.println("Hours Worked  : " + employee1.getHoursWorked());
        System.out.println("Regular Hours  : " + employee1.getRegularHours());
        System.out.println("Overtime Hours  : " + employee1.getOvertimeHours());
        System.out.println("Accumulated total Pay : $ " + employee1.getTotalPay());


        System.out.println("--------------------");

        System.out.println("Room occupied:  " + room1.isAvailable());
        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();
        System.out.println("Room Occupied:" + room1.isAvailable());

        System.out.println("--------------------");

        employee1.punchIn(9.0);
        employee1.punchOut(12.5);
        System.out.println("Employee: " + employee1.getName() + " " + "Hours worked: " + employee1.getHoursWorked());

        employee1.timeCard(9.0, true);
        employee1.timeCard(12.5, false);
        System.out.println("Hours Worked: " + employee1.getHoursWorked());

        System.out.println("--------------------");

        Hotel theHotel = new Hotel("Ritz Carlton Jr.", 50, 100);

        boolean booked = theHotel.bookRoom(5,true);
        System.out.println("Suite booking successful!" + booked);
        System.out.println("Suites Available: " + theHotel.getAvailableSuites());

        booked = theHotel.bookRoom(10, false);
        System.out.println("Basic Room Booked Successfully " + booked);
        System.out.println("Basic Rooms Available: " + theHotel.getAvailableBasicRooms());













}


}

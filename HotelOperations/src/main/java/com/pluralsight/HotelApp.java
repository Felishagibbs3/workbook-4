package com.pluralsight;

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

        Room room1 = new Room(2, 124, false,true);
        Room room2 = new Room(1, 130, true,true);

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



}


}

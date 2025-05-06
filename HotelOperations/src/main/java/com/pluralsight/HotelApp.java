package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) throws Exception {
        Reservation hoteReservation = new Reservation();
        hoteReservation.setRoomType("King");
        hoteReservation.setNumOfNights(2);
        hoteReservation.setWeekend(true);

        System.out.println("Type of Room: " + hoteReservation.getRoomType());
        System.out.println("Price per Night: " + hoteReservation.getPrices());
        System.out.println("Total Cost of Reservation: " + hoteReservation.getReservationTotalPrice());

    }
}

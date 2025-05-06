package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrices() throws Exception {
        double basePrice;
        if (roomType.equals("King")) {
            basePrice = 130.00;
        } else if (roomType.equals("Double")) {
            basePrice = 124.00;
        } else {
            throw new Exception("invalid option.");
        }
        if (isWeekend) {
            basePrice *= 1.10;
        }

        return basePrice;
    }
    public double getReservationTotalPrice() throws Exception {
        return getPrices() * numOfNights;
    }
}

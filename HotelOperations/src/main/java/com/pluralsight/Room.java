package com.pluralsight;

public class Room {
    private final int numOfBeds;
    private final double priceofRoom;
    private boolean isDirty = false;
    private boolean available;

    public Room(int numOfBeds, double priceofRoom, boolean isDirty, boolean available) {
        this.numOfBeds = numOfBeds;
        this.priceofRoom = priceofRoom;
        this.available = false;
    }
    public boolean available() {

        if (!this.isAvailable() && !this.isDirty) {
            return true;

        }

        return false;

    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getPriceofRoom() {
        return priceofRoom;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void checkIn(){
        if (isAvailable()) {
            available = true;
            System.out.println("Success! You have been checked in.");

        } else {
            System.out.println("Room not available");
        }
    }
    public void checkOut() {
        if (isAvailable()) {
            available = false;
            isDirty = true;
            System.out.println("Guest is checked out. Clean room before next booking");
        }

    }
    public boolean cleanRoom() {
        if (!isAvailable() && (isDirty)) {
            isDirty = true;
            System.out.println("Room Scheduled for Cleaning");
        } else if (isAvailable()) {
            available = true;
            System.out.println("Room is occupied");
        }
        else {
            System.out.println("Room already clean");
        }

        return false;
    }
}

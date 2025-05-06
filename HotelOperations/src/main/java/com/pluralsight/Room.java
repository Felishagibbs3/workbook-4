package com.pluralsight;

public class Room {
    private int numOfBeds;
    private double priceofRoom;
    private boolean isDirty;
    private boolean available;

    public Room(int numOfBeds, double priceofRoom, boolean isDirty, boolean available) {
        this.numOfBeds = numOfBeds;
        this.priceofRoom = priceofRoom;
        this.isDirty = isDirty;
        this.available = available;
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
}

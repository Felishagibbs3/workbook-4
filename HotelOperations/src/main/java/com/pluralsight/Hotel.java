package com.pluralsight;

public class Hotel {
    private String name;
    private int numOfSuites;
    private int numOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numOfSuites, int numOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    public Hotel(String name, int numOfSuites, int numOfRooms) {
        this.name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
    }
    public boolean bookRoom(int numOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numOfRooms) {
                bookedSuites += numOfRooms;
                return true;
            }
        } else {
            if (getAvailableBasicRooms() >= numOfRooms) {
                bookedBasicRooms += numOfRooms;
                return true;
            }
        }

        return false;
    }

    public int getAvailableSuites() {
        return numOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms() {
        return numOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}

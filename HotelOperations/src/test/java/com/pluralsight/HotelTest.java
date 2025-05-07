package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    @Test
    public void bookRoom_should_increase_bookedSuites() {

        // arrange
        Hotel theHotel = new Hotel("Ritz Carlton Jr.", 10, 50);

        // act
        theHotel.bookRoom(3, true);

        // assert
        assertEquals(7, theHotel.getAvailableSuites());

    }

    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable() {
        //arrange
        Hotel theHotel = new Hotel("Ritz Carlton Jr.", 10, 50);

        //act
        boolean booked = theHotel.bookRoom(11, true);

        //assert
        assertEquals(false, booked);

    }

    @Test
    public void getName_should_returnTheHotelsName() {
        //arrange
        Hotel theHotel = new Hotel("Ritz Carlton Jr.", 10, 50);

        // act
        String name = theHotel.getName();

        // assert
        assertEquals("Ritz Carlton Jr.", name);
    }

}
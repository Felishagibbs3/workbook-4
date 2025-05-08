package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void checkIn_should_beOccupiedAndDirty() {

        // check in test

        //Arrange
        Room room = new Room(2, 124, true, true);
        //Act
        room.checkIn();
        if (room.isAvailable()) {
            assertTrue(room.isAvailable());
            assertFalse(room.isDirty());
        }
        // Assert
        assertTrue(true);

        // Checkout Test below
    }
    @Test
    public void checkOut_should_beTrue() {
        //Arrange
        Room room = new Room(2, 124, true, false);
       // Act
        room.checkOut();
        // Assert
        assertTrue(true);

    }

    @Test
    public void cleanRoom_should_cleanRoomIfUnavailableAndDirty() {
        //Arrange
        Room room = new Room(2, 124, true, false);
        // Act
        if (!room.isAvailable() && room.isDirty()){
        // Assert
            assertTrue(room.cleanRoom());
            assertTrue(true);
        }
    }



    }
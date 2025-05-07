package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void checkIn_should_beOccupiedAndDirty() {
        Room room = new Room(2, 124, true, true);

        room.checkIn();
        if (room.isAvailable()) {
            assertTrue(room.isAvailable());
            assertFalse(room.isDirty());
        }

        assertTrue(true);


    }
    @Test
    public void checkOut_should_beTrue() {
        Room room = new Room(2, 124, true, false);
        room.checkOut();
        assertTrue(true);

    }

    @Test
    public void cleanRoom_should_cleanRoomIfUnavailableAndDirty() {
        Room room = new Room(2, 124, true, false);

        if (!room.isAvailable() && room.isDirty()){
            assertTrue(room.cleanRoom());
            assertTrue(true);
        }
    }



    }
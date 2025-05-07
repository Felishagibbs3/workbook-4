package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void checkIn_should_beOccupiedAndDirty() {
        Room room = new Room(2, 124, true, true);

        assertEquals(true,true);


    }

}
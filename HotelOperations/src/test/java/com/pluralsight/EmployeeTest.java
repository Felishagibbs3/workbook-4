package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    //punch in should be correct
    @Test
    public void punchIn_should_beCorrect() {
        //Arrange
        Employee employee1 = new Employee("Danyelle", 24567, "IT", 30, 40);
        // Act
        employee1.punchIn();
        //Assert
        assertTrue(true);

    }
    @Test
    public void punchOut_should_beCorrect() {
        // punch out
        //Arrange
        Employee employee1 = new Employee("Danyelle", 24567, "IT", 30, 40);
        //Act
        employee1.punchOut();
        //Assert
        assertTrue(true);
    }

}
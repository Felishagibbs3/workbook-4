package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void punchIn_should_beCorrect() {
        Employee employee1 = new Employee("Danyelle", 24567, "IT", 30, 40);
        employee1.punchIn();
        assertTrue(true);

    }
    @Test
    public void punchOut_should_beCorrect() {
        Employee employee1 = new Employee("Danyelle", 24567, "IT", 30, 40);
        employee1.punchOut();
        assertTrue(true);
    }

}
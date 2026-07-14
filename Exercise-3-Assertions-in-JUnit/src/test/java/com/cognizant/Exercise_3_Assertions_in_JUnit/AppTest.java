package com.cognizant.Exercise_3_Assertions_in_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    void testAdd() {
        assertEquals(30, app.add(10, 20));
    }

    @Test
    void testIsEven() {
        assertTrue(app.isEven(8));
    }

    @Test
    void testIsOdd() {
        assertFalse(app.isEven(7));
    }

    @Test
    void testMessage() {
        assertEquals("JUnit", app.getMessage());
    }

    @Test
    void testNullValue() {
        assertNull(app.getNullValue());
    }
}
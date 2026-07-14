package com.cognizant.Exercise_4_AAA_Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
        System.out.println("Before Each Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test");
    }

    @Test
    void testMultiply() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = app.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}
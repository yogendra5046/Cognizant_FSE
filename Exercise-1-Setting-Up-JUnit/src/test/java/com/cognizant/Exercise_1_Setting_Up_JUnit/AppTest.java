package com.cognizant.Exercise_1_Setting_Up_JUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd() {

        App app = new App();

        int result = app.add(10, 20);

        assertEquals(30, result);
    }
}
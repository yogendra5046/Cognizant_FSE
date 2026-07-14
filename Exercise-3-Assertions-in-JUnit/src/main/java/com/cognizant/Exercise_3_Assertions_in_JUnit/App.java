package com.cognizant.Exercise_3_Assertions_in_JUnit;


public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getMessage() {
        return "JUnit";
    }

    public String getNullValue() {
        return null;
    }
}
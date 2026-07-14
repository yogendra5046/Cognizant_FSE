package com.cognizant.Exercise_1_Configuring_a_Basic_Spring_Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.displayMessage();
    }
}
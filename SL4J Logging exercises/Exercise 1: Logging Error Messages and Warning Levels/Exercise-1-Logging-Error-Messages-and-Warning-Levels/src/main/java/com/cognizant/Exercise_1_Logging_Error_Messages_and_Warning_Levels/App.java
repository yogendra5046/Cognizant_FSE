package com.cognizant.Exercise_1_Logging_Error_Messages_and_Warning_Levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        logger.warn("This is a warning message.");

        logger.error("This is an error message.");

        logger.info("Application finished.");
    }
}
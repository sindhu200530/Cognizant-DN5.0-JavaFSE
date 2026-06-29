package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise2 {

    private static final Logger logger = LoggerFactory.getLogger(Exercise2.class);

    public static void main(String[] args) {

        String studentName = "Sindhu";
        int marks = 95;

        logger.info("Student Name: {}", studentName);
        logger.info("Marks: {}", marks);
        logger.info("Student {} scored {} marks.", studentName, marks);

    }
}
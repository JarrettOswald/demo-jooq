package com.example.demojooq.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.example.demojooq.utils.DataGenerator.getValidPassportSerial;

class DataGeneratorTest {

    private static final Logger logger = LoggerFactory.getLogger(DataGeneratorTest.class);

    @Test
    void TestGetValidPassportSerial() {
        String actual = getValidPassportSerial();
        logger.info("Actual value: {}", actual);
        boolean isValid = actual.matches("^\\d{4} \\d{6}$");
        Assertions.assertTrue(isValid);
    }
}
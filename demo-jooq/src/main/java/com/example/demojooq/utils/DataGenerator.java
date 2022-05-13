package com.example.demojooq.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class DataGenerator {
    private static final Random RANDOM;

    static {
        try {
            RANDOM = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private DataGenerator() {
    }

    public static String getValidPassportSerial() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i == 4) stringBuilder.append(" ");
            stringBuilder.append(RANDOM.nextInt(10));
        }
        return stringBuilder.toString();
    }
}

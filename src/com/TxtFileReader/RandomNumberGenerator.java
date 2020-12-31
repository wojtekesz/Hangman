package com.TxtFileReader;

import java.util.Random;

public class RandomNumberGenerator {

    public static Integer getRandomNumber (int maxNum) {
        Random random = new Random();
        return random.nextInt(maxNum);
    }
}

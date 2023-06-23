package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomGenerator {

    public static String randomString(int characterCount) {
        return RandomStringUtils.random(characterCount, true, false);
    }
}

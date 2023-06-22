package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomGenerator {

    public static String randomName() {
        String[] names = {"Peak", "Mountain", "Sun", "Hill", "Valley", "Cross", "Steel", "Good", "Bad", "Cave",
                "Strong", "Brave", "Courage", "Heights", "ABC", "Clean", "Service"};

        Random r = new Random();
        int low = 1;
        int high = 100;
        int num = r.nextInt(high - low) + low;
        String result = String.valueOf(num);

        return result + " " + names[new Random().nextInt(names.length)] + " " + names[new Random().nextInt(names.length)];
    }

    public static String randomLastName() {
        String[] names = {"Johnson", "Martinez", "Jones", "Thompson", "Freeman", "King", "Smith", "Rodriguez", "Taylor", "Brown", "Miller",
                "Jackson", "Martin", "Adams", "Allen", "Harris", "Lopez", "Wilson", "Wright", "Young"};
        return names[new Random().nextInt(names.length)];
    }

    public static String randomString(int characterCount) {
        return RandomStringUtils.random(characterCount, true, false);
    }

    public static String randomPhoneNumber() {
        String numbers = "23456789";
        String randomPhNumbers = "";
        int length = 10;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = numbers.charAt(rand.nextInt(numbers.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomPhNumbers += text[i];
        }

        return randomPhNumbers;
    }
}

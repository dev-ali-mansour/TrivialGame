package dev.ali.mansour.trivialgame.model;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static int random;


    /**
     * Start playing our trivial game
     */
    public static void play() {
        try {
            //Choose random number 1 <= random <= 1000000000
            random = getRandomNumberInRange(1, 1000000000);

            // Retrieving number from user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to our Trivial Game");
            while (random > 1) {
                System.out.print("Please enter positive number: ");
                int number = scanner.nextInt();

                while (!isValidNumber(number) && random > 2) {
                    System.out.print("Sorry, Your entered number is not valid! Try again: ");
                    number = scanner.nextInt();
                }

                random = random - number;
            }
            System.out.println("Congrats. You beat the game!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Get Random number in specified range
     *
     * @param min Minimum value
     * @param max Maximum value
     * @return Random Integer
     */
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * Check if number is valid or not
     *
     * @param number User entered number
     * @return boolean
     */
    public static boolean isValidNumber(int number) {
        return random > number && random % number != 0;
    }
}

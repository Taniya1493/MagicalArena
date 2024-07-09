package org.magicalarena;

import java.util.Random;

/**
 * Represents a dice for rolling.
 */
public class Dice {
    private Random random;

    /**
     * Constructor to initialize the dice.
     */
    public Dice() {
        this.random = new Random();
    }

    /**
     * Rolls the dice and returns the result (a random integer between 1 and 6).
     *
     * @return The result of the dice roll.
     */
    public int roll() {
        return random.nextInt(6) + 1;
    }
}

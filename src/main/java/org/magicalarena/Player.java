package org.magicalarena;

/**
 * Represents a player in the magical arena.
 */
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    /**
     * Constructor to initialize a player with given attributes.
     *
     * @param name     The name of the player.
     * @param health   The health of the player.
     * @param strength The strength of the player.
     * @param attack   The attack value of the player.
     */
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    // Method to reduce health
    public void reduceHealth(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    // Method to check if player is alive
    public boolean isAlive() {
        return this.health > 0;
    }
}

package org.magicalarena;

/**
 * Represents the magical arena where players fight.
 */
public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    /**
     * Constructor to initialize the magical arena with two players.
     *
     * @param playerA The first player.
     * @param playerB The second player.
     */
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    /**
     * Simulates a fight between two players until one player's health reaches zero.
     */
    public void startFight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                attack(playerA, playerB);
                if (playerB.isAlive()) {
                    attack(playerB, playerA);
                }
            } else {
                attack(playerB, playerA);
                if (playerA.isAlive()) {
                    attack(playerA, playerB);
                }
            }
        }
    }

    /**
     * Simulates an attack from the attacking player to the defending player.
     *
     * @param attacker The attacking player.
     * @param defender The defending player.
     */
    private void attack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();
        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;
        int damageDealt = Math.max(0, attackDamage - defendStrength);
        defender.reduceHealth(damageDealt);

        System.out.println(attacker.getName() + " attacks " + defender.getName() +
                " with roll " + attackRoll + " (attack damage: " + attackDamage + ") " +
                "defended by roll " + defendRoll + " (defend strength: " + defendStrength + "). " +
                defender.getName() + " health is now " + defender.getHealth());
    }

    /**
     * Returns the winner of the fight.
     *
     * @return The player with health greater than zero.
     */
    public Player getWinner() {
        if (playerA.isAlive()) {
            return playerA;
        } else {
            return playerB;
        }
    }
}

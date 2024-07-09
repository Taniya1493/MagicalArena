package org.magicalarena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MagicalArena class.
 */
public class MagicalArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.startFight();

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }

    @Test
    public void testGetWinner() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.startFight();

        Player winner = arena.getWinner();
        assertTrue(winner.isAlive());
    }
}

package org.magicalarena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Player class.
 */
public class PlayerTest {
    @Test
    public void testPlayerAttributes() {
        Player player = new Player("Test Player", 50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealthReduction() {
        Player player = new Player("Test Player", 50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testPlayerHealthCannotBeNegative() {
        Player player = new Player("Test Player", 50, 5, 10);
        player.reduceHealth(60);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player("Test Player", 50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}

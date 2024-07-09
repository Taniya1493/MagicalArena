package org.magicalarena;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Player playerA;
    private Player playerB;
    private Game game;

    @BeforeEach
    public void setUp() {
        playerA = new Player("Player A", 50, 5, 10);
        playerB = new Player("Player B", 100, 10, 5);
        game = new Game(playerA, playerB);
    }

    @Test
    public void testGameInitialization() {
        assertEquals(playerA, game.getPlayerA());
        assertEquals(playerB, game.getPlayerB());
    }

    @Test
    public void testGamePlay() {
        game.playGame();
        Player winner = playerA.isAlive() ? playerA : playerB;
        assertEquals(winner, game.getArena().getWinner());
    }
}

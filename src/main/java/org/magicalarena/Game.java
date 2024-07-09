package org.magicalarena;

public class Game {
    private Player playerA;
    private Player playerB;
    private MagicalArena arena;

    /**
     * Constructor to initialize the game with players and arena.
     *
     * @param playerA The first player.
     * @param playerB The second player.
     */
    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.arena = new MagicalArena(playerA, playerB);
    }

    /**
     * Starts the game and manages the fight between players until one player wins.
     */
    public void playGame() {
        System.out.println("===== Game Starts =====");
        arena.startFight();
        Player winner = arena.getWinner();
        System.out.println("Winner: " + winner.getName());
        System.out.println("===== Game Over =====");
    }

    public static void main(String[] args) {
        // Create players
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        // Create Game with players
        Game Game = new Game(playerA, playerB);

        // Start the game
        Game.playGame();
    }
}

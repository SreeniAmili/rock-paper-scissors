package com.imc.rps.game;

import com.imc.rps.player.Player;

/**
 * The RockPaperScissorsGame class encapsulates the core logic for playing rounds of the Rock-Paper-Scissors game.
 * It facilitates interactions between the human and computer players and determines the outcome of each round.
 *
 * Responsibilities:
 * - Retrieve moves from both players.
 * - Compare the moves to determine the result of the round.
 * - Display the moves and the result to the user.
 *
 * Dependencies:
 * - Player interface for human and computer player implementations.
 * - Move enum for representing the possible moves.
 * - Result enum for representing the outcome of a round.
 */
public class RockPaperScissorsGame {
    private final Player human;
    private final Player computer;

    public RockPaperScissorsGame(Player human, Player computer) {
        this.human = human;
        this.computer = computer;
    }

    public void playRound() {
        RockPaperScissorsMove humanRockPaperScissorsMove = human.getMove();
        RockPaperScissorsMove computerRockPaperScissorsMove = computer.getMove();
        Result result = humanRockPaperScissorsMove.compareMoves(computerRockPaperScissorsMove);

        System.out.printf("You played %s. Computer played %s. Result: %s%n",
                humanRockPaperScissorsMove, computerRockPaperScissorsMove, result);
    }
}

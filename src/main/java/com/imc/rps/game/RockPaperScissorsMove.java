package com.imc.rps.game;

/**
 * The RockPaperScissorsMove enum represents the possible moves in the Rock-Paper-Scissors game.
 * It includes functionality to compare moves and determine the outcome of a round.
 *
 * Responsibilities:
 * - Define the possible moves: ROCK, PAPER, SCISSORS.
 * - Provide a method to compare moves and return the result (WIN, LOSE, DRAW).
 *
 * Dependencies:
 * - Result enum for representing the outcome of a comparison.
 */
public enum RockPaperScissorsMove {
    ROCK, PAPER, SCISSORS;

    public Result compareMoves(RockPaperScissorsMove other) {
        if (this == other) return Result.DRAW;

        return switch (this) {
            case ROCK -> (other == SCISSORS ? Result.WIN : Result.LOSE);
            case PAPER -> (other == ROCK ? Result.WIN : Result.LOSE);
            case SCISSORS -> (other == PAPER ? Result.WIN : Result.LOSE);
        };
    }
}

package com.imc.rps.player;

import com.imc.rps.game.RockPaperScissorsMove;

import java.util.Random;

/**
 * The ComputerPlayer class represents a computer-controlled player in the Rock-Paper-Scissors game.
 * It generates moves randomly using the Random class, ensuring unpredictability in gameplay.
 *
 * Responsibilities:
 * - Generate a random move from the available options (rock, paper, scissors).
 *
 * Dependencies:
 * - Random for generating random numbers.
 * - Move enum for representing the possible moves.
 */
public class ComputerPlayer implements Player {
    private final Random random = new Random();

    @Override
    public RockPaperScissorsMove getMove() {
        RockPaperScissorsMove[] rockPaperScissorsMoves = RockPaperScissorsMove.values();
        return rockPaperScissorsMoves[random.nextInt(rockPaperScissorsMoves.length)];
    }
}

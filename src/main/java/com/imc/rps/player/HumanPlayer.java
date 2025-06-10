package com.imc.rps.player;

import com.imc.rps.game.RockPaperScissorsMove;

import java.util.Scanner;

/**
 * The HumanPlayer class represents a human-controlled player in the Rock-Paper-Scissors game.
 * It allows the user to input their move and validates the input to ensure it matches the expected options.
 *
 * Responsibilities:
 * - Prompt the user to enter a move (rock, paper, scissors).
 * - Validate the user's input and handle invalid entries.
 *
 * Dependencies:
 * - Scanner for reading user input.
 * - RockPaperScissorsMove enum for representing the possible moves.
 */
public class HumanPlayer implements Player {
    private final Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public RockPaperScissorsMove getMove() {
        while (true) {
            System.out.print("Enter move (rock, paper, scissors): ");
            String input = scanner.nextLine().trim().toUpperCase();
            try {
                return RockPaperScissorsMove.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}

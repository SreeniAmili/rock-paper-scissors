package com.imc.rps.app;

import com.imc.rps.player.ComputerPlayer;
import com.imc.rps.game.RockPaperScissorsGame;
import com.imc.rps.player.HumanPlayer;
import com.imc.rps.player.Player;

import java.util.Scanner;

/**
 * The RockPaperScissorsApplication class serves as the entry point for the IMC Rock-Paper-Scissors game.
 * It initializes the game components, handles user input for the number of rounds,
 * and manages the game loop to play multiple rounds.
 *
 * Responsibilities:
 * - Prompt the user for the number of rounds to play.
 * - Validate user input to ensure it is a positive integer.
 * - Execute the game rounds by interacting with Player and Game objects.
 * - Display the results and conclude the game.
 *
 * Dependencies:
 * - Scanner for user input.
 * - HumanPlayer and ComputerPlayer for player implementations.
 * - Game for managing the game logic.
 */
public class RockPaperScissorsApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player human = new HumanPlayer(scanner);
        Player computer = new ComputerPlayer();
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame(human, computer);

        int rounds = 0;
        while (rounds <= 0) {
            System.out.print("Enter number of rounds: ");
            try {
                rounds = Integer.parseInt(scanner.nextLine());
                if (rounds <= 0) {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        for (int i = 0; i < rounds; i++) {
            System.out.printf("Round %d:%n", i + 1);
            rockPaperScissorsGame.playRound();
        }

        System.out.println("Game over. Thanks for playing!");
    }
}

package com.imc.rps.app;

import com.imc.rps.player.ComputerPlayer;
import com.imc.rps.player.HumanPlayer;
import com.imc.rps.player.Player;
import com.imc.rps.game.RockPaperScissorsGame;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsApplicationTest {

    @Test
    void testValidNumberOfRoundsInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
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

        assertEquals(3, rounds);
    }

    @Test
    void testInvalidNumberOfRoundsInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("invalid\n5\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
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

        assertEquals(5, rounds);
    }


    @Test
    void testGameExecution() {
        // Simulate user input for HumanPlayer
        ByteArrayInputStream in = new ByteArrayInputStream("rock\n".getBytes());
        System.setIn(in);

        Player human = new HumanPlayer(new Scanner(System.in));
        Player computer = new ComputerPlayer();
        RockPaperScissorsGame game = new RockPaperScissorsGame(human, computer);

        // Assert that no exception is thrown during game execution
        assertDoesNotThrow(() -> game.playRound());
    }
}
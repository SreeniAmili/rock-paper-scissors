package com.imc.rps.player;

import com.imc.rps.game.RockPaperScissorsMove;

/**
 * The Player interface defines the contract for player implementations in the Rock-Paper-Scissors game.
 * It ensures that all player types can provide a move during gameplay.
 *
 * Responsibilities:
 * - Define a method to retrieve the player's move.
 *
 * Dependencies:
 * - Move enum for representing the possible moves.
 */
public interface Player {
    RockPaperScissorsMove getMove();
}

package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Player;

public class Game {
    public Player player1;
    public Player player2;
    public Player winner;
    
    public Game() {
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        if (player1.getFigure().getType() == "rock" && player2.getFigure().getType() == "scissors") {
            winner = player1;
            return;
        }

        if (player2.getFigure().getType() == "rock" && player1.getFigure().getType() == "scissors") {
            winner = player2;
            return;
        }

        if (player1.getFigure().getType() == "scissors" && player2.getFigure().getType() == "paper") {
            winner = player1;
            return;
        }

        if (player2.getFigure().getType() == "scissors" && player1.getFigure().getType() == "paper") {
            winner = player2;
            return;
        }

        if (player1.getFigure().getType() == "paper" && player2.getFigure().getType() == "rock") {
            winner = player1;
            return;
        }

        if (player2.getFigure().getType() == "paper" && player1.getFigure().getType() == "rock") {
            winner = player2;
            return;
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    
}

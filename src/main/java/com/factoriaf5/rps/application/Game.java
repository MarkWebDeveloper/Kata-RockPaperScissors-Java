package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Player;

public class Game {
    public Player player1;
    public Player player2;
    public Player winner;
    public boolean isDraw;
    
    public Game() {
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        String player1FigureType = player1.getFigure().getType();
        String player2FigureType = player2.getFigure().getType();

        if (player1FigureType == "rock" && (player2FigureType == "scissors" || player2FigureType == "lizard") || 
        player1FigureType == "scissors" && (player2FigureType == "paper" || player2FigureType == "lizard") || 
        player1FigureType == "paper" && (player2FigureType == "rock" || player2FigureType == "spock") ||
        player1FigureType == "lizard" && (player2FigureType == "spock" || player2FigureType == "paper") ||
        player1FigureType == "spock" && (player2FigureType == "scissors" || player2FigureType == "rock")) {
            winner = player1;
        }

        if (player2FigureType == "rock" && (player1FigureType == "scissors" || player1FigureType == "lizard") ||
        player2FigureType == "scissors" && (player1FigureType == "paper" || player1FigureType == "lizard") ||
        player2FigureType == "paper" && (player1FigureType == "rock" || player1FigureType == "spock") ||
        player2FigureType == "lizard" && (player1FigureType == "spock" || player1FigureType == "paper")||
        player2FigureType == "spock" && (player1FigureType == "scissors" || player1FigureType == "rock")) {
            winner = player2;
        }

        if (player1FigureType.equals(player2FigureType)) {
            isDraw = true;
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

    public boolean isDraw() {
        return isDraw;
    }

    public void setDraw(boolean isDraw) {
        this.isDraw = isDraw;
    }
    
}

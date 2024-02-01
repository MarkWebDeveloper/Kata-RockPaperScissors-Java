package com.factoriaf5.rps.models;

public class Player {
    private Figure figure;
    private Boolean isWinner = false;

    public Player() {
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }
    
}

package com.factoriaf5.rps.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {
    Player me;
    Player otherGuy;
    Rock rock;
    Paper paper;
    Scissors scissors;
    Game game;

    @BeforeEach
    void setUp() {
        me = new Player();
        otherGuy = new Player();
        rock = new Rock("rock");
        paper = new Paper("paper");
        scissors = new Scissors("scissors");
        game = new Game(me, otherGuy);
    }

    @Test
    public void rockBeatsScissorsIWin() {
        me.setFigure(rock);
        otherGuy.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void rockBeatsScissorsHeWins() {
        me.setFigure(scissors);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }
}
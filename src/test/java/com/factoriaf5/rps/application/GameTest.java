package com.factoriaf5.rps.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

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
    public void rockBeatsScissorsOtherWins() {
        me.setFigure(scissors);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void ScissorsBeatsPaperIWin() {
        me.setFigure(scissors);
        otherGuy.setFigure(paper);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void ScissorsBeatsPaperOtherWins() {
        me.setFigure(paper);
        otherGuy.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    public void PaperBeatsRockIWin() {
        me.setFigure(paper);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void PaperBeatsRockOtherWins() {
        me.setFigure(rock);
        otherGuy.setFigure(paper);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    public void RockVsRockIsDraw() {
        me.setFigure(rock);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
    }

    public void ScissorsVsScissorsIsDraw() {
        me.setFigure(scissors);
        otherGuy.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
    }

    public void PaperVsPaperIsDraw() {
        me.setFigure(rock);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
    }
}
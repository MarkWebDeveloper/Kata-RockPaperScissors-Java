package com.factoriaf5.rps.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class GameTest {
    Player me;
    Player otherGuy;
    Rock rock;
    Paper paper;
    Scissors scissors;
    Lizard lizard;
    Spock spock;
    Game game;

    @BeforeEach
    void setUp() {
        me = new Player();
        otherGuy = new Player();
        rock = new Rock("rock");
        paper = new Paper("paper");
        scissors = new Scissors("scissors");
        lizard = new Lizard("lizard");
        spock = new Spock("spock");
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

    @Test
    public void RockVsRockIsDraw() {
        me.setFigure(rock);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
        assertThat(game.isDraw(), is(true));
    }

    @Test
    public void ScissorsVsScissorsIsDraw() {
        me.setFigure(scissors);
        otherGuy.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
        assertThat(game.isDraw(), is(true));
    }

    @Test
    public void PaperVsPaperIsDraw() {
        me.setFigure(rock);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(nullValue()));
        assertThat(game.isDraw(), is(true));
    }

    @Test
    public void RockCrushesLizardIWin() {
        me.setFigure(rock);
        otherGuy.setFigure(lizard);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void RockCrushesLizardOtherWins() {
        otherGuy.setFigure(rock);
        me.setFigure(lizard);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void LizardPoisonsSpockIWin() {
        me.setFigure(lizard);
        otherGuy.setFigure(spock);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void LizardPoisonsSpockOtherWins() {
        otherGuy.setFigure(lizard);
        me.setFigure(spock);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void SpockSmashesScissorsIWin() {
        me.setFigure(spock);
        otherGuy.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void SpockSmashesScissorsOtherWins() {
        otherGuy.setFigure(spock);
        me.setFigure(scissors);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void ScissorsDecapitatesLizardIWin() {
        me.setFigure(scissors);
        otherGuy.setFigure(lizard);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void ScissorsDecapitatesLizardOtherWins() {
        otherGuy.setFigure(scissors);
        me.setFigure(lizard);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void LizardEatsPaperIWin() {
        me.setFigure(lizard);
        otherGuy.setFigure(paper);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void LizardEatsPaperOtherWins() {
        otherGuy.setFigure(lizard);
        me.setFigure(paper);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void PaperDisprovesSpockIWin() {
        me.setFigure(paper);
        otherGuy.setFigure(spock);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void PaperDisprovesSpockOtherWIns() {
        otherGuy.setFigure(paper);
        me.setFigure(spock);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }

    @Test
    public void SpockVaporizesRockIWin() {
        me.setFigure(spock);
        otherGuy.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(me));
    }

    @Test
    public void SpockVaporizesRockOtherWins() {
        otherGuy.setFigure(spock);
        me.setFigure(rock);
        game.play();
        assertThat(game.getWinner(), is(otherGuy));
    }
}
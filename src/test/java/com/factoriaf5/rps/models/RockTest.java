package com.factoriaf5.rps.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RockTest {
    
    @Test
    public void justASimpleTest() {
        Rock rock = new Rock("Rock");

        assertThat(rock.getType(), is("Rock"));
    }
}

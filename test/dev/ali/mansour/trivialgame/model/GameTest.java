package dev.ali.mansour.trivialgame.model;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Before
    public void before() throws Exception {
        Game.random = 10;
    }

    @Test
    public void isValidNumber_True_NumberIsLessThanRandomAndNotDivisor() {
        assertTrue(Game.isValidNumber(7));
    }

    @Test
    public void isValidNumber_False_NumberIsGreaterThanRandom() {
        assertFalse(Game.isValidNumber(19));
    }

    @Test
    public void isValidNumber_False_NumberIsLessThanRandomButIsDivisor() {
        assertFalse(Game.isValidNumber(5));
    }
}
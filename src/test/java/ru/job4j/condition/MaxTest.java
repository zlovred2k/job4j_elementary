package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void whenMaxLeft() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void whenMexRight() {
        int left = 2;
        int right = 20;
        int expected = 20;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void whenTwoEqual() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        assertEquals(expected, result);

    }
}
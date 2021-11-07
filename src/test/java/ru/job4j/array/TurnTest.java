package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurn1234then4321() {
        int[] array = new int[]{1, 2, 3, 4};
        int[] result = Turn.back(array);
        int[] expected = new int[]{4, 3, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurn12345then54321() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(array);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurn123456then654321() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(array);
        int[] expected = new int[]{6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, result);
    }
}
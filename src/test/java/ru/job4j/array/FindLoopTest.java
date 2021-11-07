package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenEl4Then3() {
        int[] data = {1, 2, 3, 4};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenNotFound() {
        int[] data = {1, 2, 3, 4};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }
}
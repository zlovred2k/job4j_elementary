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

    @Test
    public void whenEl5Then4() {
        int start = 1;
        int finish = 5;
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int el = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void whenNotFound11() {
        int start = 2;
        int finish = 7;
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }
}
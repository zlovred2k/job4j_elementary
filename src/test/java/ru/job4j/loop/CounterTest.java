package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenStart1Finish10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenStart5Finish10Then24() {
        int start = 5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertEquals(expected, result);
    }
}
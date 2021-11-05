package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenNumber5Then120() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        assertEquals(expected, result);
    }

    @Test
    public void whenNumber0Then1() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        assertEquals(expected, result);
    }
}
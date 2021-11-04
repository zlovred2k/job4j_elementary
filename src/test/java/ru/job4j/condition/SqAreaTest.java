package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K4Square5dot76() {
        double expected = 5.76;
        int p = 12;
        double k = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP20K2Square22dot22() {
        double expected = 22.22;
        int p = 20;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);

    }
}
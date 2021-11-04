package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To22Then1F41() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To33Then2F82() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1112To2233Then23F7() {
        int x1 = 11;
        int y1 = 12;
        int x2 = 22;
        int y2 = 33;
        double expected = 23.7;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
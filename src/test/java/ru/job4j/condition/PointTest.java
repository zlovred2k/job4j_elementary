package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.4142135623730951;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to33then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double expected = 2.8284271247461903;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1112to2233then2() {
        int x1 = 11;
        int y1 = 12;
        int x2 = 22;
        int y2 = 33;
        double expected = 23.706539182259394;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
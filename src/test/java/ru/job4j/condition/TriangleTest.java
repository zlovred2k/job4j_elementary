package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 1.0;
        double ac = 1.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertFalse(result);
    }
}
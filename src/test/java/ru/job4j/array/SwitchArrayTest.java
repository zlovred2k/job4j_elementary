package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void swap0To4() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int source = 0;
        int dest = 4;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = new int[]{5, 2, 3, 4, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void swap2To3() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = new int[]{1, 2, 4, 3, 5};
        assertArrayEquals(expected, result);
    }
}
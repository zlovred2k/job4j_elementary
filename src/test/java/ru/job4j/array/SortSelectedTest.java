package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{9, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort8() {
        int[] data = new int[]{9, 1, 5, 12, 5, 7, 8, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 5, 7, 8, 9, 12, 55};
        assertArrayEquals(expected, result);

    }
}
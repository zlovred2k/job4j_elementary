package ru.job4j.array;

public class MatrixFind {
    public static void findIndex(int[][] array, int el) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val == el) {
                    System.out.println(row + cell);
                }
            }
        }
    }
}

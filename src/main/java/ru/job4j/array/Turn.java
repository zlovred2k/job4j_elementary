package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int dist = (int) array.length / 2;
        for (int index = 0; index < array.length; index++) {
            if (dist == index) {
                break;
            }
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}

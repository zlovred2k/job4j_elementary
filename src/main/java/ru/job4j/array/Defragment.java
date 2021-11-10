package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = null;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        swap(array, index, i);
                        break;
                    }
                }
            }
        }
        return array;
    }
}

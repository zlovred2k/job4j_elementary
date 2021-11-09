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
                int point = index;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != null && i > index) {
                        int valueIndex = i;
                        swap(array, point, valueIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }
}

package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int index = 1; index < data.length; index++) {
            if (result != data[index]) {
                result = false;
                return result;
            }
        }
       return true;
    }
}

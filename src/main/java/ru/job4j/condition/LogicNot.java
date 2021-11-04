package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositiv(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositiv(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositiv(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(isPositiv(6));
        System.out.println(evenOrNotPositive(-5));
        System.out.println(notEven(4));
    }
}



package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiple(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumSubAndDiv(double first, double second) {
        return sub(first, second) + division(first, second);
    }

    public static double sumAllAction(double first, double second) {
        return sum(first, second) + multiply(first, second) + sub(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println(sumAndMultiple(2, 2));
        System.out.println(sumSubAndDiv(2, 2));
        System.out.println(sumAllAction(3, 3));
    }
}

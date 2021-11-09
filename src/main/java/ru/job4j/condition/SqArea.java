package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double sq = h * l;
        return sq;
    }

    public static void main(String[] args) {
        double sq = square(6, 2);
        System.out.println(sq);
    }
}

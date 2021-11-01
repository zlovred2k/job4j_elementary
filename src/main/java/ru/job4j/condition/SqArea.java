package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {

        //p=2*(L+h); L-длина h-высота
        //p=2*(h*k+h)
        //L=h*k

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

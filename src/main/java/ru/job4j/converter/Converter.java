package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;
    }

    public static float rubleToDollar(float value) {
        float rs1 = value / 60;
        return rs1;
    }

    public static void main(String[] args) {
        System.out.println(rubleToEuro(1000));
        System.out.println(rubleToDollar(2000));

    }
}

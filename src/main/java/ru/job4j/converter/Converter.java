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
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rub = 2 euro. Test result: " + passedEuro);

        float inDol = 120;
        float expectedDol = 2;
        float outDol = rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("120 rub = 2 dol. Test result: " + passedDol);

    }
}

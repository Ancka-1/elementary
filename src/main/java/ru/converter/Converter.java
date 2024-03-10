package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] arg) {
        float euro = Converter.rubleToEuro(100);
        float dollar = Converter.rubleToDollar(90);
        System.out.println("100 rubles are " + euro + "  euro");
        System.out.println("90 rubles are " + dollar + "  dollar");
    }
}

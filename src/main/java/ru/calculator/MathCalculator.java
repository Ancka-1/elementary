package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double minusPlusDivine(double first, double second) {
        return minus(first, second) +
                divine(first, second);

    }

    public static double commonSum(double first, double second) {
        return MathCalculator.sumAndMultiply(first, second) +
                MathCalculator.minusPlusDivine(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + commonSum(30, 20));

    }
}

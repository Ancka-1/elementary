package ru.calculator;

import ru.Math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double minusPlusDivine(double first, double second) {
        return MathFunction.minus(first, second) +
                MathFunction.divine(first, second);
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

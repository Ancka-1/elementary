package ru.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int res = first + second;
        System.out.println(res);

    }

    public static void minus(int first, int second) {
        int res = first - second;
        System.out.println(res);

    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        plus(100, 500);
        minus(4, 2);
        minus(3, 5);
    }
}
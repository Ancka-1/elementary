package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("this is negative number.");
        }

    }

    public static void main(String[] args) {
        possibleDiv(-12);
        possibleDiv(0);
    }
}
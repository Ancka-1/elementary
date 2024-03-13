package ru.calculate;

public class Out {
    public static void main(String[] args) {
        String lyrics = "Hello world";
        System.out.println(lyrics);
        String name = "Anna";
        String surname = "Usachova";
        String separate = " ";
        byte age = 25;
        separate = " - ";
        String id = name + separate + surname;
        String id2 = name + separate + age + " years old";
        System.out.println(id);
        System.out.println(id2);
        char a = 'A';
        char b = 'B';
        System.out.println(a + b);
        char c1 = '\u0035';
        char c2 = '\u004D';
        char c3 = '\u006E';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\u0031\u0032\u0033");
    }

}

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

    }

}

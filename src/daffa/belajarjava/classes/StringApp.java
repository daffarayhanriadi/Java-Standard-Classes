package daffa.belajarjava.classes;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {

        String name = "Daffa Rayhan Riadi";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Daffa"));
        System.out.println(name.endsWith("Riadi"));

        String[] names = name.split(" ");
//        System.out.println(name);
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

    }
}

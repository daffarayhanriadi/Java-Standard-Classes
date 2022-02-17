package daffa.belajarjava.application;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Daffa");
        joiner.add("Rayhan");
        joiner.add("Riadi");

        String value = joiner.toString();
        System.out.println(value);


    }
}

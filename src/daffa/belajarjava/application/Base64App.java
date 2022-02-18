package daffa.belajarjava.application;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String original = "Daffa Rayhan Riadi";

        // Konversi String -> byte[] -> original.getBytes()
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // cara mengembalikan kembali originalnya
        // Konversi byte[] ke string
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}

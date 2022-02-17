package daffa.belajarjava.application;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        // Konversi tipe data Number
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi String -> Number
        // Jika Non-Primitif, maka menggunakan valueOf()
        // Jika Primitif, maka menggunakan parseInt()
//        String contoh = "100A00"; //-> ERROR
//        String contoh = "100.00"; // -> ERROR, kecuali meng-konversi ke Double
        String contoh = "10000";
        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

    }
}

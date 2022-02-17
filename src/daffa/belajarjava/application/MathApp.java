package daffa.belajarjava.application;

public class MathApp {
    public static void main(String[] args) {

        var min = Math.min(1000, 2000);
        System.out.println(min);

        var max = Math.max(1000, 2000);
        System.out.println(max);

        // tidak perlu lagi untuk membuat secara manual, karena bisa menggunakan method-method yang sudah ada
        System.out.println(Math.PI);
    }
}

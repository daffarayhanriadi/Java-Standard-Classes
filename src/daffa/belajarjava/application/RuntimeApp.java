package daffa.belajarjava.application;

public class RuntimeApp {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        // Jika ingin mengetahui jumlah processor
        System.out.println(runtime.availableProcessors());
        // Memory
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

    }
}

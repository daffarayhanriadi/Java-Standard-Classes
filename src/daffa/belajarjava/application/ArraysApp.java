package daffa.belajarjava.application;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 23, 6, 4, 3, 11, 7, 97
        };

        Arrays.sort(numbers);

        System.out.println(numbers);
        // Konversi menjadi String agar lebih enak terlihat datanya
        System.out.println(Arrays.toString(numbers));

        //Melakukan pencarian (return nya jika menggunakan binarySecarch() adalah lokasi index nya)
        System.out.println(Arrays.binarySearch(numbers,11));
        System.out.println(Arrays.binarySearch(numbers,6));

        //Jika data tidak ada, maka tampilannya akan minus / dibawah 0
        System.out.println(Arrays.binarySearch(numbers,5));

        // copyOf() -> Copy Sesuai dengan panjang yang diinputkan
        int[] result = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));

        // copyOfRange() -> Copy Sebagian
        int[] result2 = Arrays.copyOfRange(numbers,2, 5);
        System.out.println(Arrays.toString(result2));
    }
}

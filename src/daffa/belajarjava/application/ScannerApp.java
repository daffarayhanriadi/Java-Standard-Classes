package daffa.belajarjava.application;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + " Umur anda adalah " + age);



    }
}

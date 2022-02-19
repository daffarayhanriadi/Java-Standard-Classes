package daffa.belajarjava.application;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties(); // Object
            // Mengambil data menggunakan load(lokasiFile)
            properties.load(new FileInputStream("application.properties"));

            // Mengambil properties yang ada di dalam application.properties dengan key (database.host)
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        // Akan menambahkan sendiri nya File name.properties
        try {
            Properties properties = new Properties();
            properties.put("name.fist", "Daffa");
            properties.put("name.middle", "Rayhan");
            properties.put("name.last", "Riadi");

            properties.store(new FileOutputStream("name.properties"),"Konfigurasi Nama");
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan properties");
        }

    }
}

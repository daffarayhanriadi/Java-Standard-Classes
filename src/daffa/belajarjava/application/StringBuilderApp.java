package daffa.belajarjava.application;

public class StringBuilderApp {
    public static void main(String[] args) {

        // biasanya membuat String seperti ini
        // ini memang tidak kelihatan ada masalah, tetapi sebenarnya di Java dia membuat 3 data di memorynya
        // Daffa -> 1
        // Daffa Rayhan -> 2
        // Daffa Rayhan Riadi -> 3
        /*
        String name = "Daffa";
        name = name + " " + "Rayhan";
        name = name + " " + "Riadi";
        System.out.println(name);
        */

        // Jika dilakukan seperti ini, ini akan menjadi 1 object saja di memory, sehingga dapat lebih hemat memory di Java
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Daffa");
        stringBuilder.append(" ");
        stringBuilder.append("Rayhan");
        stringBuilder.append(" ");
        stringBuilder.append("Riadi");

        String name = stringBuilder.toString();
        System.out.println(name);


    }
}

package daffa.belajarjava.application;

import java.util.Objects;

public class ObjectsApp {

        public static class Data {

            private String data;

            public Data(String data) {
                this.data = data;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Data data1 = (Data) o;

                return data != null ? data.equals(data1.data) : data1.data == null;
            }

            @Override
            public int hashCode() {
                return data != null ? data.hashCode() : 0;
            }

            // Agar data yang dikirim dapat terlihat dengan jelas
            @Override
            public String toString() {
                return "Data{" +
                        "data='" + data + '\'' +
                        '}';
            }
        }

    public static void main(String[] args) {
        // Jika nilai null dan tanpa Objects maka nilai akan ERROR
        // Jika nilai null dan Dengan Object, maka nilai tidak akan ERROR
//        execute(null);
        execute(new Data("Daffa"));
    }

    public static void execute(Data data) {

        // tanpa Objects -> harus melakukan pengecekan
        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }

        // Dengan Objects -> tanpa pengecekan kembali
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));

    }
}
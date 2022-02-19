# Java-Standar-Classes
## Regular Expression
* `Regular Expression` atau disingkat regex adalah cara untuk melakukan pola pencarian.
* Biasanya dilakukan untuk pencarian dalam data String.
* Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word.
* `Regex` adalah pencarian yang lebih advance diabnding pencarian text biasanya, misal kita ingin mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain.

---

## Regex Package
* **Java** sudah menyediakan package `java.util.regex` yang berisikan utilitas untuk melakukan proses reguler expression.
* Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu `Pattern class` dan `Matcher class`.
* `Pattern class` adalah representasi hasil kompilasi dari pola `regular expreesion` yang kita buat.
* Jadi nanti saat pertama kali kita membuat sebuah regex, itu kita harus melakukan kompilasi data `Pattern` nya terlebih dahulu, jadi membuat satu Pattern itu dikompilasi menjadi `Pattern` dan setelah selesai, baru kita bisa melakukan pencarian nya.
* Dan untuk melakukan pencariannya kita bisa menggunakan `Matcher class`.
* `Matcher class` adalah engine untuk melakukan pencarian dari Pattern yang sudah kita buat.

---

## Aturan Regular Expression
* Aturan regular expression sangat kaya, sehingga kemungkinan tidak bisa dibahas dalam satu materi.
* Kita bisa lihat detail aturan-aturannya di halaman javadoc class Pattern.
* [Aturan Regular Expression Docs in Pattern Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)
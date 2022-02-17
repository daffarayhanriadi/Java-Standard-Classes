# Java-Standar-Classes
## Date & Calender Class
* Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di **Java juga sama**, **ada class Date & Calendar yang bisa kita gunakan sebagai representasi tanggal**.
* Sebenarnya di **Java 8** sudah ada cara manipulasi tanggal yang baru menggunakan `Java Date Time API`, namun itu akan kita bahas di course terpisah.
* Sekarang kita akan fokus menggunakan `class Date dan Calendar`.

---

## Hubungan Date dan Calendar
* `Class Date` adalah class representasi tanggal sampai presisi milisecond.
* Namun di `class Date` sudah banyak method-method yang di `deprecated`, sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara `class Date dan Calendar`.
* Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal.
* [Date Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Date.html)
* [Calendar Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Calendar.html)
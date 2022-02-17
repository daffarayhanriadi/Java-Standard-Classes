# Java-Standar-Classes
## Number Class
* Semua sumber class yang bukan primitif memiliki class Parent yang sama, yaitu class Number.
* Class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain.
* Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya.
* [Number Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Number.html)

---

## Method di Number Class
|Method|Keterangan|
|---|---|
|byte byteValue()|Mengubah menjadi tipe byte|
|double doubleValue()|Mengubah menjadi tipe double|
|float floatValue()|Mengubah menjadi tipe float|
|int intValue()|Mengubah menjadi int value|
|long longValue()|Mengubah mejadi long value|
|short shortValue()|Mengubah menjadi short value|

---

## Konversi String ke Number
* `Long`, `Integer`, `Short` dan `Byte` memiliki static method untuk melakukan konversi dari String ke number.
* `parseXxx(string)` digunakan untuk mengkonversi dari string ke tipe data number primitif.
* `valueOf(string)` digunakan untuk mengkonversi dari string ke tipe data number non primitif.
* Method ini akan `throw` `NumberFormatException` jika ternyata gagal melakukan konversi String ke number.
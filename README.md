# Java-Standar-Classes
## Immutable String
* `String` adalah tipe data `immutable`, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
* **Jika** kita **ingin memanipulasi String dalam jumlah banyak**, **sangat tidak disarankan menggunakan String**, karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan `StringBuffer` atau `StringBuilder`.

---

## StringBuffer vs StringBuilder
* Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String.
* Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe.
* Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paralel, cukup gunakan StringBuilder.
* Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder.
* [Docs StringBuffer](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuffer.html)
* [Docs StringBuilder](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html)
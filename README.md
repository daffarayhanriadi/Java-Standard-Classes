# Java-Standar-Classes
## StringTokenizer Class
* StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil.
* Kita bisa memotong String dengan delimiter yang kita mau.
* Perbedaannya dengan `Split` adalah sistem nya `Lazy` artinya adalah ketika next token baru akan di potong. Sedangkan `Split` langsung dipotong semuanya saat itu juga (langsung balikannya `StringArray`).
* Jadi jika String nya terlalu besar dan ingin `Tokenizer/Memotong` isi dari Teks/File yang besar, Split itu banyak memakan memory karena `10 Mega` nya harus di Load ke memory. Tetapi apabila menggunakan `StringTokenizer` ini memotong dikit demi sedikit untuk memotong-motongnya, jadi lebih hemat memory.
* [StringTokenizer Docs](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/StringTokenizer.html)
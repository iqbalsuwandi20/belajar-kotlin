fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hi $name")

fun main() {
    /**
     * membuat function sederhana
     * deklarasi function dengan 1 baris kode
     * butuh kata kunci = setelah deklarasi nama function dan tipe data pengembalian
     */
    println(double(13))
    println(hi("Iqbal"))
}
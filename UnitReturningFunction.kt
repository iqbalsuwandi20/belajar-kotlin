fun printHello(name: String?): Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    /**
     * function ada 2 jenis yaitu tidak mengembalikan data dan mengembalikan data
     * yg sudah dibuat function nya dia mengembalikan tipe data Unit
     * penulisan Unit tidak wajib, jika menuliskan menggunakan kata kunci Unit
     * 
     */
    printHello("Iqbal")
}
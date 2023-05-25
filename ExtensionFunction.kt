fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    /**
     * kemampuan menambahkan function pada tipe data yg sudah ada
     * salah satu fitur yg sangat powerfull dan harap bijak menggunakannya
     * kita cukup menambahkan tipe data pada nama functionnya, lalu diikuti dengan tanda .
     * untuk mengakses datanya kita menggunakan kata kunci this
     */
    val name: String = "Iqbal"
    println(name.hello())

    name.printHello()
    "Suwandi".printHello()
}
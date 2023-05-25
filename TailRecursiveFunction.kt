fun main() {
    /**
     * saat dijalankan memanggil function dirinya sendiri terlalu dalam, maka bisa dimungkinkan akan terjadi error stack overflow
     * teknik mengubah menjadi looping biasa ketika dijalankan
     * di function menambahkan kata kunci tailrec
     * hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain
     * 
     */
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
    display(1000)

    // tail recursive factorial 
    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }
    println(factorialTail(10))
}
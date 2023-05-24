fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

// return didalam percabangan
fun bagi(c: Int, d: Int): Int {
    if (d == 0) {
        return 0
    } else {
        val result = c / d
        return result
    }
}

fun main() {
    /**
     * untuk memberi tahu untuk mengembalikan data, wajib menyebutkan tipe datanya
     * untuk mengembalikan data dari function, kita kita bisa menggunakan kata kunci return
     * diikuti dengan tipe datanya
     */
    val result = sum(10, 40)
    println(result)

    println(bagi(10, 0))
}
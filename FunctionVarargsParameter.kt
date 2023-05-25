fun finalValue(vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    /**
     * varargs adalah variable argument
     * datanya bisa menerima dari satu input atau di anggap array
     * menggunakan kata kunci vararg
     * harus berada di terakhir parameter
     */
    val result = finalValue(12,12,12,12,12)
    println(result)
}
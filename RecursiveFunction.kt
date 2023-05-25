fun main() {
    /**
     * memanggil dirinya sendiri
     * contoh kasus yang lebih mudah diselesaikan adalah factorial
     * 
     */
    // loop factorial
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i 
        }
        return result
    }
    println(factorialLoop(10))

    // recursive function factorial
    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(10))
}
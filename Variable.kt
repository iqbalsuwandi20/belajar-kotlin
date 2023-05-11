const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    /**
     * Variable adalah tempat menyimpan data
     * var adalah data yg bisa diubah (Mutable)
     * val adalah data yg tidak bisa diubah (Immutable)
     * Nullable variable yang boleh kosong dengan kata null agar membuat variable bisa null menggunakan tanda ?
     * Variable Constant immutable data, yg biasanya diakses untuk keperluan global atau diakses manapun untuk menandainya itu menggunakan UPPER_CASE dan harus val
     */
    val firstName = "Iqbal"
    // firstName = "Suwandi" error
    var age = 22

    println(firstName)
    println(age)

    // Variable yg bisa null
    var name: String? = null
    name = "Iqbal"
    println(name)
    println(name?.length)
    
    // Variable Constant
    println("$APPLICATION : $VERSION")
}
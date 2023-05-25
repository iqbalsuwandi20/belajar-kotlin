infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    /**
     * adalah operasi yg dilakukan pada operasi matetimatika dimana dia melakukan operasi terhadap dua data
     * tidak wajib menggunakan tanda .
     * harus sebagai function member atau function extension
     * harus memiliki 1 parameter
     * parameter tidak boleh varargs dan tidak boleh memiliki nilai default
     * 
     */
    val result = "Iqbal Suwandi".to("UP")
    println(result)
    val result2 = "Iqbal Suwandi".to("LO")
    println(result2)
}
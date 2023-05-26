// method references
fun toUpper(value: String): String = value.toUpperCase()


fun main() {
    /**
     * dianggap seperti tipe data yang lainnya
     * bisa disimpan di variable, array
     * lambda adalah function tidak memiliki nama
     * tidak perlu menggunakan kata kunci fun
     * 
     * kata kunci it harus parameter 1 saja tidak boleh lebih dari 1
     * 
     * method references membuat lambda dengan referensi yg sudah ada
     * 
     */
    // lambda expression di variable
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result 
    }

    // manggil lambda expression di variable
    val result = contohLambda("Iqbal", "Suwandi")
    println(result)

    // kata kunci it
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Iqbal"))

    // method references
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Iqbal Suwandi"))
}
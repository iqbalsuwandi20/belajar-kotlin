fun main() {
    /**
     * function menggunakan function sebagai parameter atau mengembalikan function
     * lambda yg dijadikan sebagai parameter function
     */
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    println(hello("Iqbal", { value: String -> value.toUpperCase() }))

    //trailing lambda
    val result = hello("Iqbal") { value: String ->
        value.toLowerCase()
    }
}
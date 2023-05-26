fun main() {
    /**
     * lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
     * anonymous function mirip dengan lambda, hanya cara membuatnya saja yang sedikit berbeda
     * tetap menggunakan kata kunci fun
     */
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Iqbal", upper))
    println(hello("", upper))

    println(hello("Suwandi", fun(value: String): String {
        return value.toLowerCase()
    }))
}
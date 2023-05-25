fun main() {
    /**
     * mengembalikan nilai dalam if atau when
     */
    fun sayHello(name: String = ""): String {
        // if
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }

    fun sayGoodBye(name: String = ""): String {
        // when
        return when (name) {
            "" -> "Good Bye Bro!"
            else -> "Good Bye $name"
        }
    }
    println(sayHello())
    println(sayHello("Iqbal"))

    println(sayGoodBye())
    println(sayGoodBye("Iqba"))
}
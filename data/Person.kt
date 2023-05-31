package data

// cara membuat class
class Person {
    // cara membuat properties
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String? = null

    fun sayHello(name: String): Unit {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}

/**
 * menggunakan kata kunci class
 * sebaiknya nama file untuk membuat class itu di samain
 * 
 * kalimat depan harus huruf besar
 */
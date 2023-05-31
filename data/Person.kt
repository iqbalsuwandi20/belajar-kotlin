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

    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, My Name is $firstName")
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
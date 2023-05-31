package app

import data.Person

fun main() {

    val name = Person() 
    name.firstName = "Iqbal"

    name.sayHello("Jaki", "Akbar")
}
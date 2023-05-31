package app

import data.Person

fun main() {

    val name = Person()
    name.firstName = "Garul"

    name.sayHello("Budi")
    name.sayHello("Joko", "Nugroho")
}
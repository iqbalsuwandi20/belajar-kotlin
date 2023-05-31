package app

import data.Manager
import data.VicePresident

fun main() {

    val manager = Manager("Iqbal")
    manager.sayHello("Suwandi")

    val vicePresident = VicePresident("Steven")
    vicePresident.sayHello("Garul")
}
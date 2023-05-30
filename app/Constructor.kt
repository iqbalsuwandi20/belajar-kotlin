package app

import data.Car

fun main() {
    // cara mengakses constructor
    val avanza = Car("Toyota")
    avanza.year = 2015

    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}
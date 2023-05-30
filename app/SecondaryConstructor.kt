package app

import data.Address

fun main() {
    // cara mengakses secondary constructor
    val address1 = Address("Jalan A", "Jakarta") 
    val address2 = Address("Jalan B", "Malang", "Indonesia")
    
    println(address1.street)
    println(address2.street)
}
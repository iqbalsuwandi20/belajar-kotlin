package app

import data.Person

fun main() {
    
    val name = Person()
    name.firstName = "Iqbal"  
    name.middleName = "Suwandi"  
    name.firstName = "Steven"
    
    name.sayHello("Garul")
    name.run()
    
    val fullName = name.getFullName()
    println(fullName)
}
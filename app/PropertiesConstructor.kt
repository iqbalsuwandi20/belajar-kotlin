package app

import data.User

fun main() {

    val user1 = User("Iqbal", "Rahasia")
    val user2 = User("Suwandi", "Rahasia123")

    user1.username = "Steven"
    user1.password = "Sangat Rahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}
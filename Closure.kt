fun main() {
    /**
     * kemampuan sebuah funciton, lambda atau anonymous function berinteraksi dengan data- disekitarnya dalam scope yang sama
     * harap gunakan fitur closure ini dengan bijak
     * 
     */
    var counter: Int = 0
    
    // lambda
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    //anonymous
    val anonymousIncrement = fun() {
        println("Anonymous Funtion Increment")
        counter++
    }

    // function biasa
    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}
package data

// cara membuat class
class Car
(
    // cara membuat constructor
    paramBrand: String, paramYear: Int = 2020
    ){
        // cara membuat initializer block
        init {
            println("Car $paramBrand dibuat")
        }
        // cara mengakses constructor
        var brand: String = paramBrand
        var year: Int = paramYear
}
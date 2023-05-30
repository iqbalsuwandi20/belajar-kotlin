package data

// cara membuat class
class Car
(
    // cara membuat constructor
    paramBrand: String,
    paramName: String,
    paramYear: Int){
        
        // cara membuat initializer block
        init {
            println("Car $paramBrand dibuat")
        }

        // cara membuat secondary constructor
        constructor(paramBrand: String, paramName: String): this(paramBrand, paramName, 2020) {
            println("Secondary Constructor 1")
        }
        constructor(paramBrand: String): this(paramBrand, "") {
            println("Secondary Constructor 2")
        }

        // cara mengakses constructor
        var brand: String = paramBrand
        var name: String = paramName
        var year: Int = paramYear
}
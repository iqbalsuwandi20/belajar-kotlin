package data

// cara membuat class
class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // tanpa primary constructor
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String) 
    : this(paramStreet, paramCity) {
        country = paramCountry
    }
}
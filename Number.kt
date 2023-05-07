fun main() {

    /**
     * Integer Number adalah bilangan bulat
     * Floating Point Number adalah bilangan pecahan
     * Literals adalah untuk membuat seperti binary, hexa decimal dll
     * Underscore adalah untuk membaca angka agar tidak bingung
     * Conversion adalah untuk mengkonversi tipe data
     */
    // Integer
    var age: Byte = 30 // max value : 127
    var height: Int = 170 // maz value : 32767
    var distance: Short = 2000 // max value : 2 JUTA
    var balance: Long = 1000000000000L // jika long hrs menggunakan L dibelakang angka, max value: 9 TRILIUN 

    println(age)
    println(height)
    println(distance)
    println(balance)

    // Floating Point
    var value: Float = 98.12F // jika float hrs menggunakan F dibelakang angka
    var radius: Double = 2131231231.989898 

    println(value)
    println(radius)

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF // jika ingin hexa decimal harus depan 0x
    var binaryLiteral: Int = 0b0001 // jika ingin binary harus menggunakan 0b

    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // Underscore
    var price: Long = 9_000_000_000L // menggunakan _ untuk tidak bingung
    
    println(price)

    // Conversion
    var number: Int = 100
    var byte: Byte = number.toByte() // menggunakan . lalu apa yg ingin di convert
    println(byte)

}
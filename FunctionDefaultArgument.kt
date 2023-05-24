fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hai $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    /**
     * saat memanggil tidak wajib nilai pada parameter
     * default ini cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi
     * 
     */
    hello("Iqbal")
    hello("Iqbal", "Suwandi")
}
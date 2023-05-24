fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    /**
     * data yang dikirim dari luar function
     * tidak ada batas dari membuat parameter
     * dan boleh null
     * jika menambahkan parameter, jika memanggil function wajib memasukan data
     */
    sayHello("Iqbal", "Suwandi")
    sayHello("Steven", null)
}
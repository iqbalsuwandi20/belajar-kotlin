fun fullName (
    firstName: String,
    middleName: String,
    lastName: String
    ) {
        println("Hello $firstName $middleName $lastName")
}

fun main() {
    /**
     * semakin banyak parameter semakin sulit memasukan data
     * ini adalah dimana kita bisa menyebutkan nama parameter saat memanggil function
     * dengan demikian kita tidak wajib tau posisi tiap parameter
     * 
     */
    fullName(
        lastName = "Suwandi",
        firstName = "Muhammad",
        middleName = "Iqbal",
    )
}
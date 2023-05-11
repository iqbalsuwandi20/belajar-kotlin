fun main() {

    /**
     * String adalah kumpul character atau teks
     * menggunakan tanda kutip "" jika ingin lebih dari 1 bari menggunakan tiga tanda kutip
     * String trim margin adalah menggabungkan beberapa baris jadi satu baris menggunakan |
     * String Template adalah cara menggabungkan string, tanda $ kalau kompleks menggunakan $[]
     */
    var firstName: String = "Iqbal"
    var lastName: String = "Suwandi"

    var address: String = """
    |GG. H.Samat,
    |RT.01/RW.05,
    |Kunciran Induk,
    |Pinang,
    |Banten
    """.trimMargin() // menggunakan tambahan .trimMargin()

    println(firstName)
    println(lastName)
    println(address)

    // Menggabungkan String Template Simple dan Kompleks
    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}
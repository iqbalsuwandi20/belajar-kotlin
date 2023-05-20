fun main() {
    /**
     * && artinya dan
     * || artinya atau
     * ! artinya kebalikan
     * 
     * operasi &&
     * jika ada yang false maka hasilnya akan false
     * 
     * operasi ||
     * jika hasil kiri kanan false maka masilnya akan false
     * 
     * operasi !
     * jika true maka hasil false 
     * dan sebaliknya
     * 
     */
    val nilaiUjian = 80
    val nilaiAbsen = 70
    val nilaiTugas = 75

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusTugas = nilaiTugas > 75

    val apakahLulus1 = apakahLulusUjian && apakahLulusAbsen && apakahLulusTugas
    val apakahLulus2 = apakahLulusUjian || apakahLulusAbsen || apakahLulusTugas
    val apakahLulus3 = apakahLulusUjian && apakahLulusAbsen || apakahLulusTugas

    println(apakahLulus1)
    println(apakahLulus2)
    println(apakahLulus3)
}
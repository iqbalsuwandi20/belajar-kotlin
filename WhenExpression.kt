fun main() {
    /**
     * untuk melakukan percabangan agar lebih simple dari if
     * saat expresif jadi lebih di rekomendasikan
     * dengan menggunakan kata kunci when
     * 
     * untuk menggunakan multiple option di wen expression agar lebih cepat
     * 
     * when expression In untuk array
     * agar lebih cepat menggunakan kata kunci in
     * 
     * when expression is untuk mengecek isi data
     * menggunakan kata kunci is
     * 
     * when adalah menggantikan if else
     * 
     */
    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }
    //mutiple option
    when (finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda tidak Lulus")
        } 
    }
    // when expression in
    var nilaiLulus: Array<String> = arrayOf( "A", "B", "C")
    when (finalExam) {
        // in nilaiLulus -> println("Selamat Anda Lulus")
        // !in nilaiLulus -> println("Maaf, Anda tidak Lulus")
    } 
    // when expression is
    val name = "iqbal"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }
    //when tanda variable
    val examValue = 90
    when {
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }
}
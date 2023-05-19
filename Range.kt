fun main() {
    /**
     * membuat data menjadi berurutan
     * jika membuatnya dengan array itu sangat capek
     * cara membuatnya itu menggunakan ..
     * 
     * operasi range
     * count() mendapatkan total data di range
     * contains(value) mengecek terdapat value ada
     * first nilai awal
     * last nilai akhir
     * step kenaikannya atau keturunan nya di cek
     * 
     * jika ingin kebalikannya menggunakan downTo
     */
    val range = 0.. 1000
    println(range.count())
    println(range.contains(50))
    println(range.contains(200000))
    println(range.first)
    println(range.last)
    println(range.step)

    // rannge terbalik
    val range2 = 100 downTo 1
    println(range2)

    // menggunakan step
    val range3 = 100 downTo 1 step 2
    println(range3)
}
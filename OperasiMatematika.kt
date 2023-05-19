fun main() {
    /**
     * + penjumlahan
     * - pengurangan
     * * perkalian
     * / pembagian
     * % sisa bagi
     * bisa dilakukan pada tipe data apapun
     * 
     * operasi augmented assignments untuk mempersingkat
     * a = a+10 menjadi a += 10
     * a = a-10 menjadi a -= 10
     * a = a*10 menjadi a *= 10
     * a = a/10 menjadi a /= 10
     * a = a%10 menjadi a %= 10
     * 
     * unary operator untuk mempersingkat
     * a = a + 1 menjadi ++
     * a = a - 1 menjadi --
     * negativ menjadi -
     * positiv menjadi + (tidak perlu karena by default sudah positiv)
     * boolean kebalikan menjadi !
     * 
     */

     // jika ingin hasil floating point harus mengguakan . dibelakang angka
    var result1 = 10.0 / 3.0
    println(result1)

    var result2 = 31 + 20 / 9
    println(result2)

    // cara menggunakan augmented assigments
    var total = 0
    
    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    // cara memnggunakan unary operator
    total++
    total--
    println(total)

    val suhu = -2
    println(suhu)

    val sehat = true
    println(!sehat)
}
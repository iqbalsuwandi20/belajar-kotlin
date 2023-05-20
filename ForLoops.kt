fun main() {
    /**
     * for loops adalah perulangan fitur pertama
     * menggunakan kata kunci for
     * 
     */
    //for untuk array menggunakan kata kunci for dan in
    val names = arrayOf("Iqbal", "Suwandi", "Steven")
    
    var total = 0;
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan sebanyak = $total")
    // for untuk range
    for (i in 200 downTo 0 step 2) {
        println(i)
    }
    // kombinasi antara array dan range
    val ukuranNames = names.size - 1
    for (i in 0..ukuranNames) {
        println("Index $i = ${names.get(i)}")
    }
}
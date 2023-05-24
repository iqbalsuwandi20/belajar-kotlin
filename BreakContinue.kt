fun main() {
    /**
     * adalah kata kunci untuk perulangan
     * break untuk menghentikan sebuah perulangan
     * continue untuk menghentikan perulangan yang berjalan, dan lansung menlanjutkan keperulangan selanjutnya
     * 
     */
    // Break
    var i = 0
    while (true) {
        println("Break me $i")
        i++
        if (i > 1000) {
            break
        }
    } 

    // Continue
    for (a in 1..1000) {
        if (a % 2 == 0) {
            continue
        }
        println(a)
    }
}
fun main() {

    /**
     * Array adalah tipe data yg berisikan kumpulan data dengan tipe yg sama dan menggunakan kata Array
     * size untuk manggil panjang array
     * get(index) memdapat posisi index
     * [index] memdapat posisi index
     * set(index, value) mengubah data di posisi index
     * [index] = value mengubah data diposisi index
     * 
     * Array tidak boleh null
     * jika ingin boleh harus menggunakan ?
     */
    val names: Array<String> = arrayOf("Iqbal", "Suwandi", "Steven")

    // names = arrayOf("") karena variable VAL

    // mengubah value array
    //names.set(2, "Garul")
    names[2] = "Garul"

    // manggil data array
    println(names[2])

    val nilai: Array<Int> = arrayOf(10,2,5)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //jika boleh null
    val members: Array<String?> = arrayOfNulls(3)
    members[0] = "Iqbal"
    members[1] = "Iqbal"
    members[2] = "Iqbal"
    println(members[1])
}
package app

import data.Person

/**
 * membuat object mirip seperti manggil function dengan menggunakan nama class
 * tidak butuh kata kunci khusus
 */
fun main() {
    // cara membuat object
    val iqbal = Person()
    // cara mengakses properties
    iqbal.firstName = "iqbal"

    val suwandi = Person()
    suwandi.middleName = "suwandi"

    println(iqbal)
    println(suwandi)
}
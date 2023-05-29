fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            // break for label
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            // label for continue
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main() {
    /**
     * label adalah penanda
     * semua expression bisa di tandain
     * menggunakan kata kunci @
     * tidak boleh ada spasi
     * 
     * salah satu diintegrasikan dengan break, continue dan return
     * 
     */
    //label for return
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@ {
        if (it == "") {
            return@test
        } else {
            println("Iqbal")
        }
    } 
}
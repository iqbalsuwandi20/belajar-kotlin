inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String,
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    /**
     * kemampuan yang mengubah higher order function menjadi inline function
     * dimana code di dalam higher order function akan di duplikat agar pada saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang
     * 
     * noinline
     * jika ingin memberi tahu bahwa jangan melakukan inline terhadap parameter
     * menggunakan kata kunci noinline
     */
    for (i in 0..100) {
        println(hello({"Iqbal"}, {"Suwandi"}))
    }
}
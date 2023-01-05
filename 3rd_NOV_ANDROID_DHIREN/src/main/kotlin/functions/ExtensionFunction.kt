package functions

fun main() {

    var str = "Tops"

    //var s = str.plus(" Technologies")
    var s = str.plusTwoString(" Technologies", " Pvt Ltd")
    println(s)




}

// Extension Function
fun String.plusTwoString(str1: String, str2: String): String {
    return this+ str1 + str2
}

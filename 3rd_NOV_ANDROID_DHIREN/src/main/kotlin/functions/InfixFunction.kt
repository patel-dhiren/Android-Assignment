package functions

fun main() {

    var num1 = 34
    var num2 = 56

    //println(num1.greater(num2))
    println(num1 greater num2)

}

// Infix Function
infix fun Int.greater(num: Int): Int {
    return if (this > num) this else num
}
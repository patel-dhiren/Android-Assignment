package functions

import java.util.*

fun main() {

    println("program begins : ")
    multiply()
    multiply(12, 5)
    multiply(56, 8)
    multiply(56, 3)
    var res = factorial()
    println(filterColor('b'))
    println("factorial : $res")
    println("program ends")
}


// without return type and without parameter
fun multiply() {
    var num1 = 23
    var num2 = 5

    println(num1 * num2)
}

// without return type and with parameter
fun multiply(num1: Int, num2: Int) {
    println(num1 * num2)
}

// without parameter and with return type
fun factorial(): Int {
    var num = 5
    var fact = 1

    for (i in 1..num) {
        fact *= i        // fact = fact*i
    }
    return fact
}

fun filterColor(ch: Char): MutableList<String> {
    var colors = arrayOf("Red", "Green", "Yellow", "Blue", "Black", "Orange")

    var list = mutableListOf<String>()  // mutable List

    for (color in colors) {
        if (color.startsWith(ch, ignoreCase = true)) {
            list.add(color)
        }
    }

    return list

}

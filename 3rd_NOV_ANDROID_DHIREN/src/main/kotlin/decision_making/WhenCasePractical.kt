package decision_making

fun main() {

    var num = 18

    when (num) {
        0, 11 -> println("0 or 11")
        in 1..10 -> println("From 1 - 10")
        !in 12..14 -> println("Not from 12 - 14")
        else -> println("Invalid Number")
    }
}
package decision_making

fun main() {

    var totalMarks = 500
    var subjects = 5

    print("Enter obtain marks : ")
    var obtainMarks = readLine()!!.toInt()

    var per = (obtainMarks / totalMarks.toFloat()) * 100

    var grade = when (per.toInt() / 10) {
        9, 8 -> "A+"
        7 -> "A"
        6 -> "B"
        4, 5 -> "C"
        else -> "failed"
    }

    println(grade)
}
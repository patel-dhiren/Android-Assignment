package decision_making

fun main() {

    var totalMarks = 500
    var subjects = 5

    print("Enter obtain marks : ")
    var obtainMarks = readLine()!!.toInt()

    var per = (obtainMarks / totalMarks.toFloat()) * 100

    var grade = if (per >= 90) {
        //println("A+")
        "A+"
    } else if (per >= 80 && per < 90) {
        "A"
    } else if (per >= 70 && per < 80) {
        "B+"
    } else if (per >= 60 && per < 70) {
        "B"
    } else if (per >= 45 && per < 60) {
        "C"
    } else {
        "Failed"
    }

    println(grade)
}
package decision_making

//WAP to find out the largest number from given two numbers. (dynamically)
fun main() {

    print("Enter num1 : ")
    var num1 = readLine()!!.toInt()     // convert string to int

    print("Enter num2 : ")
    var num2 = readLine()!!.toFloat()   // convert string to float

    var result = if (num1 > num2) {
        // true
        num1
    } else {
        // false
        num2
    }

    println("$result is larger..")

}
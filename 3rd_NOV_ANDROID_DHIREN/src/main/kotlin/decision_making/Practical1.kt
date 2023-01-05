package decision_making

//WAP to find out the largest number from given three numbers using nested if. (dynamically)
fun main() {

    print("Enter num1 : ")
    var num1 = readLine()!!.toInt()     // convert string to int

    print("Enter num2 : ")
    var num2 = readLine()!!.toInt()

    print("Enter num3 : ")
    var num3 = readLine()!!.toInt()

//    num1 = 34  num2 = 67  num3 = 89

    var result = if (num1 > num2) {
        if (num1 > num3) {
            //println("num1 = $num1 is greater")
            num1
        } else {
            //println("num3 = $num3 is greater")
            num3
        }

    } else {

        if (num2 > num3) {
            //println("num2 = $num2 is greater")
            num2
        } else {
            //println("num3 = $num3 is greater")
            num3
        }

    }

    println("$result is larger.")

}
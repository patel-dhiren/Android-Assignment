package arrays

fun main() {

    // int array
    var numArray = intArrayOf(34,67,89,3,23,67)

    // float array
    var floatArray = floatArrayOf(23.4f, 34.6f, 67f, 789f)

    // string
    var colorArray = arrayOf("red", "green", "blue", "orange")

    // iterate array elements

    var sum = 0
    for(num in numArray){
        print("$num\t")
        sum+=num        // sum = sum+num
    }

    println()
    println("summation of array element : $sum")

    for(value in floatArray){
        print("$value\t")
    }

    println()

    for(color in colorArray){
        print("$color\t")
    }

    println()
    // length
    println("length : ${floatArray.size}")

    println()

    // iterate element on index base
    /*for(i in 0 until numArray.size){
        println("${numArray[i]}")
    }*/

    for(i in numArray.indices){
        print("${numArray[i]}\t")
    }

}
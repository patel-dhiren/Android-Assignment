package looping

fun main() {

    // print 1 to 10 using for loop
    var sum = 0
    for (num in 1..10) {
        print("$num\t")
        sum += num
    }

    println()
    // print 10 to 1 using for loop
    for (num in 10 downTo 1) {
        print("$num\t")

    }

    println()
    // print upto n-1 using for loop
    for (num in 1 until 10) {
        print("$num\t")
    }

    println()
    // step to
    for (i in 1..20 step 3){
        print("$i\t")
    }
}
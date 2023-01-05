package looping

/*
*
**
***
****
******/

fun main() {

    var counter = 1

    for (i in 1..5) {

       /* for (k in 1..5 - i) {
            print(" ")
        }*/

        for (j in 1..i) {
            print("$counter")
            counter++
        }

        println()

    }

}
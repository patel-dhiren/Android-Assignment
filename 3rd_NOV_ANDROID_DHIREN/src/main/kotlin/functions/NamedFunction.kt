package functions

fun main() {

    //Named Function
    countries(num = 34, c3 = "India", c1 = "Japan", c2 = "China")

    states(s3 = "Gujarat", s1 = "Bihar",  s2 = "Maharashtra")

}

// Default parameter function
fun states(s1:String, s2:String = "NA", s3:String) {
    println("""
        s1 : $s1
        s2 : $s2
        s3 : $s3
    """.trimIndent())
}

fun countries(c1: String, c2: String, c3: String, num: Int) {
    println(
        """
        c1 : $c1
        c2 : $c2
        c3 : $c3
    """.trimIndent()
    )
}
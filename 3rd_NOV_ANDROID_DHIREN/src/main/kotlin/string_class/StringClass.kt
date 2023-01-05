package string_class

fun main() {

    var city = "Surat"
    var state:String = "Gujarat"    // or character array

    println(city)
    println(state)

    /*for(ch in state){
        println(ch)
    }*/

    // raw string

    println("""
        1. addition 
        2. subtraction 
        3. multiplication
        4. division
    """.trimIndent())

    var str = "  Tops Technologies         "

    // length
    println("length : ${str.length}")

    // trim (remove addition spaces)
    println("length : ${str.trim().length}")

    // equals
    var str1 = "Tops   "
    var str2 = "tops"

    if(str1.trim().equals(str2, ignoreCase = true)){
        println("Both are equal")
    }else{
        println("Both are different")
    }

    str = "Tops Technologies"

    // get
    println("value at index 7 : ${str.get(7)}")

    var newStr = str.plus(" Pvt Ltd")
    println(newStr)

    // startWith
    println(str.startsWith("t", ignoreCase = true))

    // contains
    println(str.contains("Tech"))

    // lowercase and uppercase
    println(str.lowercase())
    println(str.uppercase())

    // reverse
    println(str.reversed())

    // substring
    println(str.substring(5))
    println(str.substring(5,9))
    println(str.substring(5..8))

    // indexOf
    println("index of o : ${str.indexOf('o', startIndex = 5)}")
    println("index of o : ${str.lastIndexOf("o")}")

    // replace
    println(str.replace("Tops", "Hops"))
    //println(str)

    println(str.compareTo("tops"))

    // removeRange
    println(str.removeRange(4..10))

    str = "123"
    println(str.toInt())        // converting string into Int

    var path = "C:\\android\\kotlin\\test.txt"

    //println(path.substring(18))
    println(path.substring(path.lastIndexOf("\\")+1))

}
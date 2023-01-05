package null_safety

fun main() {

    var str:String? = "null"      // nullable object
    var s:String = "tops"       // Non-Nullable object

    // In JAVA
    /*if(str!=null){
        println("length : ${str.length}")
    }*/

    // In Kotlin
    if(str!=null){
        println("length : ${str!!.length}")     // Not null assertion
    }

    println("length : ${str?.length}")     // Here, ?. = Safe call operator

    // Elvish Operator (?:)

    var s1 = str?.uppercase() ?: "NULLABLE"

    println("uppercase : ${s1}")


}
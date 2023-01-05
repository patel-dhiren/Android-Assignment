package arrays

fun main() {

    // array function and properties
    var languages = arrayOf("java", "kotlin", "python", "C++", "C language", "php")

    // size
    println("size : ${languages.size}")

    // get index based value
    println("value at index-2 : ${languages[2]}")

    // get index based on value
    println("index of C++ : ${languages.indexOf("C++")}")

    for(lang in languages){
        print("$lang\t")
    }
    // update value on index base
    //languages[3] = "Dart"
    languages.set(languages.indexOf("C++"), "Dart")

    println()

    for(lang in languages){
        print("$lang\t")
    }

    println()
    // contains
    println("contains : ${languages.contains("C++")}")

    // shuffle
    languages.shuffle()

    for(lang in languages){
        print("$lang\t")
    }

    println()
    // sort
    languages.sort()
    for(lang in languages){
        print("$lang\t")
    }

    println()

    languages.sortDescending()
    for(lang in languages){
        print("$lang\t")
    }
}
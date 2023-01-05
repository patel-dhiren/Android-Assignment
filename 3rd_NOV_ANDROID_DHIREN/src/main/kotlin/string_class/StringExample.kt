package string_class

fun main() {

    var array = arrayOf("Java", "Android", "kotlin", "Java Script", "Python", "PHP")

    for(lang in array){

        if(lang.contains("PH", ignoreCase = true)){
            println(lang)
        }

    }

}
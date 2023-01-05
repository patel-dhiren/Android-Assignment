package inheritance

open class Parent{
    constructor(message:String){
        println(message)
    }       // secondary constructor
}

class Child : Parent{
    constructor() : super("Parent class constructor called")
    {
        println("Child class constructor called")
    }
}

fun main() {
    var c1 = Child()
}
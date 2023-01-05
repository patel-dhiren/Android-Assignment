package inheritance.single_inheritance

open class A {

    var a = "classA"

    fun showA() {
        println(a)
    }

}

class B : A(){

    var b = "classB"

    fun showB() {
        println(b)
    }

}

fun main() {

    var objA = A()
    objA.showA()

    println("**************")

    var objB = B()
    objB.showA()
    objB.showB()


}
package inheritance.multilevel_inheritance

open class A {

    var a = "classA"

    fun showA() {
        println(a)
    }

}

open class B : A(){

    var b = "classB"

    fun showB() {
        println(b)
    }

}

class C : B(){

    var c = "classC"

    fun showC() {
        println(c)
    }
}

fun main() {

    var objA = A()
    objA.showA()

    println("**************")

    var objB = B()
    objB.showA()
    objB.showB()

    println("**************")

    var objC = C()
    objC.showA()
    objC.showB()
    objC.showC()


}
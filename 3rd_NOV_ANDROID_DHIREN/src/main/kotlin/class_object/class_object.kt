package class_object

// this - it's a reference variable which refers current class object.

class Student {

    // data members
    var roll: Int = 0
    var name: String = ""
    var course: String = ""

    // constructor with no parameter
    constructor(){
        println("No parameter constructor called..")
    }

    // parameterized constructor
    constructor(roll: Int, name: String, course: String){
        this.roll = roll
        this.name = name
        this.course = course
    }


    fun setData(roll: Int, name: String, course: String) {
        this.roll = roll
        this.name = name
        this.course = course
    }

    // member function
    fun showDetail() {
        println(
            """
            roll : $roll
            name : $name
            course : $course
        """.trimIndent()
        )
    }

}

fun main() {

    var s1: Student = Student()
    var s2 = Student()

    // initialization of an object by reference
    s1.roll = 1
    s1.name = "Jay"
    s1.course = "Android"

    s1.showDetail()

    print("Enter roll : ")
    s2.roll = readLine()!!.toInt()
    print("Enter name : ")
    s2.name = readLine()!!
    print("Enter course : ")
    s2.course = readLine()!!

    s2.showDetail()

    // object initialization by method
    var s3 = Student()
    s3.setData(3, "Kavita", "QA")
    s3.showDetail()

    // Object initialization by constructor
    var s4 = Student(5, "Janvi", "SE")
    s4.showDetail()
}
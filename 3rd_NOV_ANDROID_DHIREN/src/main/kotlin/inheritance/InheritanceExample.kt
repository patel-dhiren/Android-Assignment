package inheritance

open class User {

    var id: Int
    var name: String
    var email: String

    constructor(id: Int, name: String, email: String) {
        this.id = id
        this.name = name
        this.email = email
    }

}

class Teacher : User {

    var salary: Double
    var department: String

    constructor(id: Int, name: String, email: String, salary: Double, department: String) : super(id, name, email) {
        this.salary = salary
        this.department = department
    }


    fun showTeacherDetail() {
        println(
            """
            id : $id
            name : $name
            salary : $salary
        """.trimIndent()
        )
    }

}


class Student : User {

    var roll: Int
    var course: String
    var fees: Double

    constructor(id: Int, name: String, email: String, roll: Int, course: String, fees: Double) : super(
        id,
        name,
        email
    ) {
        this.roll = roll
        this.course = course
        this.fees = fees
    }


    fun showStudentDetail() {
        println(
            """
            id : $id
            name : $name
            course : $course
        """.trimIndent()
        )
    }

}


fun main() {

    var s1 = Student(1, "Nigam", "nigam@gmail.com", 11, "Android", 25000.0)
    s1.showStudentDetail()

    var t1 = Teacher(2, "Dhiren", "dhiren@gmail.com", 20000.0, "HR")
    t1.showTeacherDetail()
}
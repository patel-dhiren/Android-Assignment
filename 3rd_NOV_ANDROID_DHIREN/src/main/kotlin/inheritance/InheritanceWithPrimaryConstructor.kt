package inheritance

// Inheritance with Primary Constructor
open class Person(
    var id: Int,
    var name: String,
    var email: String
)

class Faculty(id: Int, name: String, email: String, salary: Double, department: String) : Person(id, name, email) {

    var sal = salary

    init {
        println(
            """
            id : $id
            name : $name
            email : $email
            salary : $salary
            department : $department
        """.trimIndent()
        )
    }

    fun show(){
    }


}


fun main() {
    var f1 = Faculty(22, "Jay", "jay@gmail.com", 30000.0, "HR")
}
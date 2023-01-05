package class_object

class Product(
    var id: Int,
    var name: String,
    var desc: String,
    var mrp: Double,
    var dis: Float
){


    // initialization block
    init {

        //id = 45

        println("""
            id : $id
            name : $name
            desc : $desc
            mrp : $mrp
            dis : $dis
        """.trimIndent())
    }

    // methods or secondary constructor
   /* fun show(){
        println("""
            id : $id
            name : $name
            desc : $desc
            mrp : $mrp
            dis : $dis
        """.trimIndent())
    }*/

}

fun main() {

    var p1 = Product(11, "Titan Watch", "watch", 8500.00, 10.0f)
    //p1.show()
}
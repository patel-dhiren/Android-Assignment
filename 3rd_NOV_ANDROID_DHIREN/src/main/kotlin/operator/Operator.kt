package operator

fun main() {

    // Arithmetic Operators (+, -, /, *, %)
    var num1 = 34
    var num2 = 56

    println("addition of $num1 and $num2 = ${num1+num2}")
    println("multiplication of $num1 and $num2 = ${num1*num2}")
    println("modulus of $num1 and 3 = ${num1%3}")   // reminder

    //  Assignment Operators (+=, -=, *=, /=, %=, =)

    var a = 23
    //a+=10
    a+=10            //a = a+10
    a-=20           // a = a-20
    a%=3            // a = a%3
    println(a)

    // Increment and Decrement Operator  (++, --)
    var num = 10
    num++   // increase value by 1
    num--   // decrease value by 1
    num--
    println(num)        // 9

    //println(num++)      // 10     // postfix
    println(++num)      // prefix

    // Comparison and Equality Operators (==, > ,<, <=, >=, !=)
    println(num!=10)

    // Logical Operator  (&&, || , !)
    println(!(num>10 || num<20))

}
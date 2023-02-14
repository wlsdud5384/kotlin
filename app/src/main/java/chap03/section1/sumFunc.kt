package chap03.section1

fun sum(a: Int, b: Int): Int {
    var sum = a+b
    return sum
}

fun main() {
    val result1 = sum(3,2)// IntelliJ IDEA 에서 매개변수 (a:3, b:2)를보여줌
    val result2 = sum(6,7)// IntelliJ IDEA 에서 매개변수 (a:6, b:7)를보여줌

    println(result1)
    println(result2)
}
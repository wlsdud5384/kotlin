package Example8

fun main() {

    println("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number > 0) {
        factorial *= number
        --number
    }
    println("Factorial: $factorial")


}


package Example6

fun main() {
    print("Enter the Int: ")
    var x = readLine()!!.toInt()

    when (x) {
        0,1 -> print("x == 0 or x == 1")
        else -> print("기타")
    }
}
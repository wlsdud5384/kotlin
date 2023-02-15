package Example6

fun main() {
    var data = "hello"
    when (data) {
        "hello" -> println("data is hello")
        "whrld" -> println("data is world")
        else -> {
            println("data is not valid data")
        }
    }
}
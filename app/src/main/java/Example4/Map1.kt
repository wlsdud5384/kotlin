package Example4

fun main() {
    var map = mapOf<String, String>(Pair("one", "김진영"), "two" to "world")
    println(
        """
           map size : ${map.size}
            map data : ${map.get("one")}, ${map.get("two")}
        """

    )
}
package Example14

class Person {
    lateinit var name: String       // 늦은 초기화를 위한 선언

    fun test() {
        if(!::name.isInitialized) { //프로퍼티의 초기화 여부 판단
            println("not initialized")
        }else {
            println("initialized")
        }
    }
}

fun main() {
    val Kildong =  Person()
    Kildong.test()
    Kildong.name = "Kildong"    // 이 시점에서 초기화됨(지연 초기화)
    Kildong.test()
    println("name = ${Kildong.name}")
}
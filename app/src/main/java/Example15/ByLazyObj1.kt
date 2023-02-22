package Example15

class Person(val name: String, val age: Int)
fun main() {
    var isPersonInstantiated: Boolean = false // ① 초기화 확인 용도
    val person : Person by lazy { // ② lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person("Kim", 23) // ③ 이 부분이 Lazy 객체로 반환 됨
    }
    val personDelegate = lazy { Person("Hong", 40) } // ④ 위임 변수를 사용한 초기화
    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
    println("person.name = ${person.name}") // ⑤ 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}") // ⑥ 이 시점에서 초기화
    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}

package Example13



fun main() {
    val user = User(1, "Sean", 30)

    //게터에 의한 값 획득
    val name = user.name

    // 세터에 의한 값 지정
    user.age = 41

    println("name: $name, ${user.age}")
}
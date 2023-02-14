package Example2

fun main() {

//fun add(name: String, email: String) {
//    //name 과 email을 회원 목록에 저장
//}
//
//add("박현규", "default")
//add("박용규", "default")
//add("함진아", "default")

fun add(name: String, email:String = "default") {
    //name 과 email을 회원목록에 저장
    // email 의 기본값은 "default". 즉, email로 넘어오는 값이 없으면 자동으로 "default"입력
}

add("Youngdeok") // email 인자를 생략하여 호출(name에만 "Youngdeok"이 전달됨)

}
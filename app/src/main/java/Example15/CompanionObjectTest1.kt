package Example15

class Person1 {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person1.language)   //인스턴스를 생성하지 않고 기본값 사용
    Person1.language = "English"    //기본값 변경 가능
    println(Person1.language)   //변경된 내용 출력
    Person1.work()      //메서드 실행
    //println(Person1.name)  // name 은 companion object 가 아니므로 에러
}
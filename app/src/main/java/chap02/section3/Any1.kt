package chap02.section3

fun main() {
    var a: Any = 1 // Any a형는 1로 초기화될 때 Int 형이 됨
    a = 20L // Int형이였던 a 는 변경된 값 20L 에 의해 Long 이 됨
    println("a: type: ${a.javaClass}") // a의 자바 기본형을 출력하면 long이 나몽
}
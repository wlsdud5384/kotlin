package chap03.section1

fun main() {
    val num1 = 10   //임시 변수 혹은 지역변수
    val num2 = 3    //임시 변수 혹은 지역변수
    val result: Int

    result = max(num1, num2) //두번째 스택 프레임
    println(result)
}

fun max(a: Int, b:Int) = if(a > b) a else b // a와 b는 max 의 임시 변수
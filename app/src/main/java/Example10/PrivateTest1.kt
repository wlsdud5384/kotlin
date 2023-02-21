package Example10

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        privateFunc()   //접근허용
    }
}
class OtherClass {
    //val opc = PrivateClass()    //불가 - 프로퍼티 opc 는 private이 되야함
    fun test() {
        val pc = PrivateClass()     // 생성 가능
    }
}
fun main() {
    val pc = PrivateClass()     //생성가능
    //pc.i    //접근 불가
    //pc.privateFunc()    //접근 불가
}
fun TopFunction() {
    val tpc = PrivateClass()    //객체 생성 가능
}
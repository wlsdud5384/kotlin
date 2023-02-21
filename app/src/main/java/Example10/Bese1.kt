package Example10

open class Base1 {
    // 이 클래스에서는 a, b, c, d, e 접근 가능
    private val a = 1       // 프라이빗 처리되어서 같은 클래스의 Nested 얘만 사용가능 a는
    protected open val b = 2    // b 는 프로텍티드 오픈 되어있어서 Nested 랑, Derived1 얘도 가능
    internal val c = 3
    val d = 4   // 가시성 지시자 기본값은 public
    protected class Nested {
        // 이 클래스에서는 a, b, c, d, e, f 접근 가능
        public val e: Int = 5   // public 생략 가능
        private val f: Int = 6
    }
}
class Derived1 : Base1() {
    // 이 클래스에서는 b, c, d, e 접근 가능
    // a 는 접근 불가
    override val b = 5  //Base 의 'b' 는 오버라이딩 됨 - 상위와 같은 protected 지시자
}
class Other1(base: Base1) {
    // base.a, base.b 는 접근 불가
    // base.c 와 base.d 는 접근 가능( 같은 모듈 안에 있으므로)
    // Base.Nested 는 접근 불가, Nested::e 역시 접근 불가
}

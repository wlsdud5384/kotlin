package Example7

fun main() {
    var sum: Int =0
    var sum1: Int =0
        //누적합계 1~10까지
//    for(i in 1..10) {
//        sum += i
//    }
//    println(sum)

    //2부터 10 까지 2씩증가
//    for(i in 2..10 step 2) {
//        sum += i
//        println(sum)
//    }

    // 1부터 9까지 1씩증가(10은 미포함)
//    for(i in 1 until 10) {
//        sum += i
//        println(sum)
//    }
    println("========1~10짝수=======")
    for(i in 1..10) {
            i
            if(i%2 ==0) {
                println("짝수 출력: $i")
            }
            }

        println("========1~10홀수=======")
        for(i in 1..10) {
            i
            if(i%2 !=0) {
                println("홀수 출력: $i")
            }
        }

    println("========1~10까지의 홀수 누적합계=======")
        for(i in 1..10 step 2) {
            sum +=i
            println("홀수 출력: $i")

        }
        println(sum)

    println("========1~10까지의 짝수 누적합계=======")
    for(i in 2..10 step 2) {
        sum1 +=i
        println("짝수 출력: $i")

    }
    println(sum1)

    sum = 0
    println("========1~10까지의 10을 제외한 숫자를 내림차순으로 출력=======")
        for(i in 10 downTo 1) {
            if(i in 1 until 10) {
                println("내림차순 출력:  $i")
            }
        }

    println("=======부장,차장,과장,대리,사원=======")
    println("입력: ")
    var grade = readLine()!!.toString()
    when (grade){
        "부장" -> println(600)
        "차장" -> println(500)
        "과장" -> println(400)
        "대리" -> println(300)
        "사원" -> println(200)
        else -> println("다시 입력")

    }

    println("=========성적프로그램램==========")
    println("점수: ")
    var number = readLine()!!.toDouble()
    var clas: Char = 'F'
    when (number) {
        in 90.0..100.0 -> clas ='A'
        in 80.0..89.9 -> clas ='B'
        in 70.0..79.9 -> clas ='C'
        in 60.0..69.9 -> clas ='D'
        in 50.0..59.9 -> clas ='E'
        !in 40.0..49.9 -> clas = 'F'
    }
    println("점수: $number 등급: $clas")



}
        





package com.example.ch3

import com.example.test.User
import com.example.test.data
import com.example.test.formatData
import java.util.*

fun main() {
    data = 20
    var saydate = formatData(Date())
    println(saydate)
    println(data)
    User().sayHello()
}

fun someFun() {
    val data3: Int
    //오류println("data3 : $data3")   //오류
    data3 = 10
    println("Data3 : $data3") //성공!!
}

class User {
    //val data4: Int      //오류!!
    val data5: Int =10 //성공
}

lateinit var data3: String //성공




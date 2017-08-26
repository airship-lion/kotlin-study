package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/25.
 * Desc
 */

open class A(var name: String, age: Int) {
    val aage = age+10
    var d = 0
    var a = 0
//        get() {
//            println("get a")
//            return field
//        }
//        get() = field
//        get
        set
    lateinit var b: String
    var c: String = "ccc"
    val e: String by lazy {
        println("lazy init e")
        "eee"
    }

}

fun main(args: Array<String>) {
    var aa = A("tom", 22)
    println(aa.a)
    println(aa.e)
    println(aa.name)
    println(aa.aage)

//    aa.a
}
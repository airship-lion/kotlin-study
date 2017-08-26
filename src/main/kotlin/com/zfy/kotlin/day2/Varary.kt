package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

fun main(args: Array<String>) {
    hello1(2.0, 1, 2, 3, y = "aa")
    hello1(2.0, 1, 2, 3, y = "aa", z = 22)
    hello2(2.0, 1, 2, 3)
    hello2(2.0, 1, 2, 3, z = 33)
    hello3(2.0, 1, 2, 3)
    hello3(x = *intArrayOf(1, 2, 3))
}

fun hello1(dd: Double, vararg x: Int, y: String, z: Int = 10): Unit {
    println("--hello1----")
    println(dd)
    x.forEach(::println)
    println(y)
    println(z)
    println()
}

fun hello2(dd: Double, vararg x: Int, z: Int = 10): Unit {
    println("--hello2----")
    println(dd)
    x.forEach(::println)
    println(z)
    println()
}

fun hello3(dd: Double = 333.1, vararg x: Int): Unit {
    println("--hello3----")
    println(dd)
    x.forEach(::println)
    println()
}

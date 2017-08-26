package com.zfy.kotlin.day1

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */

fun getName(): String? {
    return null

}

fun main(args: Array<String>) {
    var a = 3
    a = 5
//    val b=7
//    b=9
//    var name = getName()?:return
    println(getName() ?: "aa")
    println(getName()?.length)
    println(getName()!!.length)
}
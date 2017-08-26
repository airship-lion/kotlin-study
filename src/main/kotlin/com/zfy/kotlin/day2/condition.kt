package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

fun main(args: Array<String>) {
    val aa: Int
    if (3 > 2) {
        aa = 11
    } else {
        aa = 22
    }
    println(aa)

    val bb = if (3 > 2) {
        33
    } else {
        44
    }
    println(bb)
//    val cc = (3 > 2)?55:66//不支持三元表达式
    val dd = if (3 > 2) 77 else 88
    println(dd)
}
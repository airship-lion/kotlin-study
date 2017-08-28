package com.zfy.kotlin.day4

/**
 * Created by bahamut on 2017/8/27.
 * Desc 闭包
 */

fun out(): () -> Unit {
    var x = 0
    return fun() {
        println(++x)
    }
}

fun main(args: Array<String>) {
    val foo = out()
    foo()
    foo()
    foo()
}
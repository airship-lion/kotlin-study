package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

class JvmOverload {
    @JvmOverloads
    fun foo(a: Int = 0) {
        println("foo")
    }
}
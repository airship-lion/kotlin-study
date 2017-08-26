package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

fun main(args: Array<String>) {
    var a=try {
        1/0
    }catch (e:Exception){
        e.printStackTrace()
        33
    }finally {
        println("finally")
    }
    println(a)
}
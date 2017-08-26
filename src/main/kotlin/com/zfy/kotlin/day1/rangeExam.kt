package com.zfy.kotlin.day1

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */
 
var aa:IntRange=1..20
var bb:IntRange=3 until 25
fun main(args: Array<String>) {
    println(aa.isEmpty())
    println(aa.contains(5))
    println(aa.contains(50))
    aa.forEach { aaa-> println(aaa) }
    println("---------")
    bb.forEach { aaa-> println(aaa) }
    println("---------")
    for (i in aa) {
        println("  $i")
    }
}
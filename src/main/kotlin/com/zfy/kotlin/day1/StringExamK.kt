package com.zfy.kotlin.day1

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */
var a: String = "hello"
var b: String = String(charArrayOf('h', 'e', 'l', 'l', 'o'))
fun main(args: Array<String>) {
    println(a == b)
    println(a === b)
    println(1 == 1)
    println(1 === 1)
    var c: Int = 0
    var d: Int = 1
    println("$c+$d=${c + d}")
    println("$c")
    println("$10")
    println("\$e")
    var ff: String = """aaa
        bbb第三方f斯蒂芬
        """
    println(ff)
//    var gg: String = "aaa
//        bbb
//        "
    println(ff.length)
}

package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

//扩展方法,可以为已有的类动态添加方法，这样就不需要util了，调用方便很多
fun String.multple(i: Int): String {
    val sb = StringBuilder()
    for (j in 0 until i) {
        sb.append(this)
    }
    return sb.toString()
}

operator fun String.times(i: Int): String {
    return multple(i)
}

//扩展属性不能初始化，类型接口属性
val String.a: Int
    get() = 5

var String.b: Int
    get() = 5
    set(value) {
//        不能设置field=value，因为扩展属性没有字段，但没有set方法会报错，只能空实现
    }

fun main(args: Array<String>) {
    var str: String = "abc"
    println(str.multple(3))
    println(str * 3)
}
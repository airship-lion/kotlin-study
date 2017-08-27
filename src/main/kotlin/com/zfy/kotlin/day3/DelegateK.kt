package com.zfy.kotlin.day3

import kotlin.reflect.KProperty

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

class AA {
    val a: String by lazy {
        "hello"
    }

//    代理，访问b就是访问代理的getValue,设置值就是访问setValue方法
    var b: String by MyDelegate()

}

class MyDelegate {
    private var x: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("MyDelegate getValue")
        return x ?: ""
    }

    operator fun setValue(aa: AA, property: KProperty<*>, s: String) {
        println("MyDelegate setValue")
        x = s
    }
}

fun main(args: Array<String>) {
    var aa :AA = AA()
    aa.a
    aa.b
    aa.b="sdf"

}
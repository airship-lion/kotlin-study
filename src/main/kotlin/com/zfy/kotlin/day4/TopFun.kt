package com.zfy.kotlin.day4

/**
 * Created by bahamut on 2017/8/27.
 * Desc 高阶函数
 */

fun main(args: Array<String>) {
    val strs = arrayOf("aaa", "bbb", "ccc")
    strs.forEach(::println)
    val gg = AA::bb
    strs.filter(String::isNotEmpty)
    val cc = CC()
    strs.forEach(cc::dd)
//    在页面定义的静态方法::ff可以通过编译，但是CC::ee是找不到方法的，只能 CC.ee()调用
//    strs.forEach(CC::ee)
    strs.forEach(::ff)
    CC.ee("dfs")
}

class AA {
    fun bb() {

    }
}

class CC {
    fun dd(any: Any) {
        println(any)
    }

    companion object {
        fun ee(any: Any) {
            println(any)
        }
    }
}

fun ff(any: Any) {
    println(any)
}
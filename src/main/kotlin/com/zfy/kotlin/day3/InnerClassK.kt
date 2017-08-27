package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

interface Listener {
    fun onClick()
}

class View {
    var listener: Listener? = null
}

fun main(args: Array<String>) {
    val v = View()
//    匿名内部类
    v.listener = object : Listener{
        override fun onClick() {
            println("onCLick")
        }
    }
}
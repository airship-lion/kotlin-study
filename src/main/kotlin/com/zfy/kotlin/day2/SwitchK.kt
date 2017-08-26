package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

class SwitchK {
    fun onClick(state: Int) {
        when (state) {
            1 -> println(111)
            2 -> println(222)
            3, 4 -> println(333)
            else -> println("default")
        }
    }

    fun find() {
        var x = 5
        when (x) {
            is Int -> println("x is Int")
            in 1..100 -> println("x in 1..100")
        }
    }

}

fun main(args: Array<String>) {
    var switchK = SwitchK()
    switchK.onClick(3)
    switchK.find()
    val mode = when {(3 > 2) -> 3
        else -> 9
    }
    println(mode)
}
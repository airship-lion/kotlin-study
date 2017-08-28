package com.zfy.kotlin.day4

import java.io.File

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
        if (map[it] == null) {
            map[it] = 1
        } else map[it] = map[it]!! + 1
    }
    map.forEach(::println)
}
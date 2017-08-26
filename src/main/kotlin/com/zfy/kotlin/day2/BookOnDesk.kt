package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

class Book {
    infix fun on(desk: Desk): Boolean {
        return true
    }
}

class Desk {}

fun main(args: Array<String>) {
    if (Book() on Desk())//中缀表达式 dsl,不要滥用，会影响读代码
        println("yes")
}
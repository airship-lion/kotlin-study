package com.zfy.kotlin.day1

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */
var abool: Boolean = false
var aInt: Int = 1
var maxInt: Int = Int.MAX_VALUE
var minInt: Int = Int.MIN_VALUE
var maxLong: Long = Long.MAX_VALUE
var minLong: Long = Long.MIN_VALUE
var aLong: Long=5
var bLong: Long= aInt.toLong()
var maxFloat: Float = Float.MAX_VALUE
var minFloat: Float = Float.MIN_VALUE
var maxDouble: Double = Double.MAX_VALUE
var minDouble: Double = Double.MIN_VALUE
var aFloat: Float = 2.0f
var aChar: Char = 'a'

fun main(args: Array<String>) {
    println(abool)
    println(aInt)
    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(minInt)
    println(-Math.pow(2.0, 31.0))
    println(maxLong)
    println(minLong)
    println(maxFloat)
    println(minFloat)
    println(maxDouble)
    println(minDouble)
    println(aFloat)
    println(aChar)
}
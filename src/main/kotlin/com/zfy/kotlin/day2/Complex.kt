package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

class Complex(var a: Int,var b: Int) {
    operator fun plus(other: Complex): Complex {
        println("override fun plus Complex")
        return Complex(a + other.a, b + other.b)
    }

    operator fun plus(other: Int): Complex {
        println("override fun plus Int")
        return Complex(a + other, b)
    }


    override fun toString(): String {
        return "Complex(a=$a, b=$b)"
    }


}

fun main(args: Array<String>) {
    var complex1 = Complex(1, 2)
    var complex2 = Complex(22, 3)
    println(complex1)
    println(complex2)
    var complex3 = complex1 + complex2
    println(complex3)
    println(complex1 + 2)
//    println(2 + complex1)
}
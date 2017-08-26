package com.zfy.kotlin.day2

/**
 * Created by bahamut on 2017/8/25.
 * Desc
 */
val aaaa = 22

fun main(args: Array<String>) {
    val a = 1
    val b = 2
    val rs = sum1(a, b)
    val rs2 = sum2(a, b)
    val rs4 = sum4(a, b)
    val rs5 = sum5(a, b)
    val rs6 = sum6(a, b)
    val rs7 = sum7(a, b)
    val rs8 = sum8(a, b)
    val rs9 = sum9(a, b)
    val rs10 = sum10(a, b, 3)
    rs4()
    println("sum1 $rs")
    println(::sum1)
    println(::sum1 is ((Int, Int) -> Int))
    println("sum2 $rs2")
    println("sum3 ${sum3}(a, b)")
    println("sum4 $rs4")
    println("sum5 $rs5")
    println("sum6 $rs6")
    println("sum7 $rs7")
    println("sum8 $rs8")
    println("sum9 $rs9")
    println("sum9(3,4) ${rs9(3, 4)}")
    println("sum10 $rs10  sum10本身 ${sum10}")

    spPrint()
    spPrint2()
    println(aaaa)
    var intArr: IntArray = intArrayOf(1, 2, 3)
    println("-------")
    intArr.forEach {
        if (it == 2) return@forEach//return 当前次循环，相当于continue
        println(it)
    }
    intArr.forEach forEach11@ {
        if (it == 2) return@forEach11//return 当前次循环，相当于continue，forEach11@相当于给forEach起别名用来return，起别名后原来名字不能用
        println(it)
    }
    intArr.forEach {
        if (it == 2) return//return 整个main方法
        println(it)
    }
    intArr.forEach({ println(it) })
    intArr.forEach { println(it) }
    intArr.forEach(::println)
    intArr.forEach { i -> println(i) }
    intArr.forEach { i: Int -> println(i) }
}


fun spPrint2(): Unit {
    println("bbb")
}

fun spPrint() {
    println("aaa")

}

fun sum2(i: Int, j: Int) = i + j
fun sum7(i: Int, j: Int) = (i + j)
fun sum8(i: Int, j: Int) = (i + j) * 2
fun sum5(i: Int, j: Int) = { i + j }

fun sum9(i: Int, j: Int) = { a: Int, b: Int -> i + j + a + b }
fun sum4(i: Int, j: Int) = {
    i + j
    println("sum4")
}

fun sum6( i: Int, j: Int) = {
    println("sum6")
    i + j
}

fun sum1(i: Int, j: Int): Int {
    return i + j
}

val sum3 = fun(i: Int, j: Int): Int {
    return i + j
}

val sum10 = { a: Int, b: Int, c: Int -> a + b + c }

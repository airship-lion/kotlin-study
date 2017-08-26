package com.zfy.kotlin.day1

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */

open class MyType(var name: String, var age: Int) {
    init {
//        name = name + "sss"
        println(name)
    }
}

class MySonType(name: String, age: Int) : MyType(name, age) {
    init {
        println("son")
    }

    var gender: Boolean? = null
}

fun main(args: Array<String>) {
    var my: MyType = MyType("sdf", 22)
    println(my.name + "  " + my.age)
    if (my is MySonType) {
        println(my.name + "  " + my.gender)
    }
//    println(my.age)

    var myson: MySonType = MySonType("aaa", 43)
    println(myson.name + "  " + myson.age + "  " + myson.gender)
    println(myson is MySonType)
    println(myson is MyType)
    var my2: MyType = myson
//    println(my2.name + "  " + my2.gender)
    if (my2 is MySonType) {
        println(my2.name + "  " + my2.gender)
    }
    var my3=my as? MySonType
    println(my3)
    println(my.javaClass.simpleName)
    println(my.javaClass.name)
    println(MyType::name)
    println(MyType::class.java.simpleName)
    println(MyType::class.java.name)
}
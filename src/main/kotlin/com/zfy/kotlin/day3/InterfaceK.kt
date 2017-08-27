package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

interface InterfaceK {
    fun talk()
    var name: String

    companion object {
        //        @JvmStatic
        val age = 543

        //        接口不支持JvmStatic
//        @JvmStatic
        fun lauch() {
            println("lauch")
        }
    }

}

//interface InterfaceK {
//    fun talk()
//}

interface InputKKK {
    fun accept() {
        println("InputKKK accept $age")
    }

    var age: Int
}

interface InKKK {
    fun accept() {
        println("InKKK accept")
    }
}

abstract class AbsKKK {
    open fun accept() {
        println("AbsKKK accept")
    }
}


class KKK(override var age: Int) : AbsKKK(), InputKKK, InKKK {
    override fun accept() {
//        super.accept()//有多个接口时不能确定哪个接口实现不能这样，改为下面实现
//        java是单继承，但kotlin的super不仅是父类，还可以是接口，就像多继承一样
        super<AbsKKK>.accept()
        super<InputKKK>.accept()
        super<InKKK>.accept()
        println("override accept $age")
    }

    companion object {
        @JvmStatic
        fun foo() {
            println("foo")
        }

        @JvmField
        var age = 10
    }
}

fun main(args: Array<String>) {
    println(InterfaceK.age)
    InterfaceK.lauch()
//    var ik: InputKKK = InputKKK { println("a") }
    var ik: InputKKK = KKK(22)
    ik.accept()
    var ij: InterfaceJ = InterfaceJ { println("a") }
    ij.talk()
}
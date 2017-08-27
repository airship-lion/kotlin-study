package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

abstract class Person(open var age: Int) : Eat {
    open fun talk() {

    }

    open fun walk() {

    }
}

interface Eat {
    fun eat()
}

class Man(age: Int) : Person(age) {
    override fun eat() {
        println("man eat")
    }

    override var age: Int = age
        get() = 10
        set

    override fun talk() {

    }

    override fun walk() {
        super.walk()

    }
}

class Woman(age: Int) : Person(age) {
    override fun eat() {
        println("woman eat")
    }
}

//by关键字，内部代理给eat处理,相当于下面的代码,但是eat要定义为类成员变量，不然访问不到
//override fun eat() {
//    eat.eat()
//}

class God(age: Int, val eat: Eat) : Person(age), Eat by eat {
//    override fun eat() {
//        println("god eat")
//    }
}

fun main(args: Array<String>) {
    val person: Person = Man(22)
    println(person.age)
    val man = Man(25)
    println(man.age)
    val woman = Woman(25)
    println(woman.age)
    val god = God(99999, woman)
    god.eat()
}
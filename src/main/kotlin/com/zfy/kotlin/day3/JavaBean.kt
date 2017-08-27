package com.zfy.kotlin.day3

/**
 * Created by bahamut on 2017/8/27.
 * Desc 在class前加上data代表这个类是Javabean，编译器会自动添加所需方法。
 * 但是生成的类是final的，并且没有无参构造方法，要在build.gradle里加上插件，如以下代码
 *  dependencies {
 *   classpath "org.jetbrains.kotlin:kotlin-noarg:$kotlin_version"
 *   classpath "org.jetbrains.kotlin:kotlin-allopen:$kotlin_version"
   }

apply plugin: 'kotlin-noarg'
apply plugin: 'kotlin-allopen'

noArg {
annotation("com.zfy.kotlin.day3.JavaBeanK")
}
allOpen {
annotation("com.zfy.kotlin.day3.JavaBeanK")
}

JavaBeanK是一个注解类，实现如下
annotation class JavaBeanK
 */
@JavaBeanK
data class Country(var id: Int, var name: String)

fun main(args: Array<String>) {
    var co = Country(1, "sss")
    println(co)
}
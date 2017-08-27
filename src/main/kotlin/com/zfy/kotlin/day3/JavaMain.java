package com.zfy.kotlin.day3;

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

public class JavaMain {
    public static void main(String[] args) {
//        System.out.println(SingletonJ.instant);
//        System.out.println(SingletonJ.instant);
        System.out.println(SingletonJ.getInstant());
        System.out.println(SingletonJ.getInstant());

        System.out.println(InterfaceK.Companion.getAge());
        InterfaceK.Companion.lauch();
        KKK.Companion.foo();
        KKK.foo();
//        System.out.println(KKK.Companion.getAge());
        System.out.println(KKK.age);

        new JvmOverload().foo(2);
        new JvmOverload().foo();

        System.out.println(ExtendsKKt.times("abc", 3));
    }
}

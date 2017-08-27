package com.zfy.kotlin.day3;

/**
 * Created by bahamut on 2017/8/27.
 * Desc
 */

public class SingletonJ {
    private SingletonJ(){}
//    public static final SingletonJ instant=new SingletonJ();
    private static final SingletonJ instant=new SingletonJ();

    public static SingletonJ getInstant() {
        return instant;
    }
}


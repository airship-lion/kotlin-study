package com.zfy.kotlin.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by bahamut on 2017/8/25.
 * Desc
 */

public class JavaMain {
    private static int aaa;
    public String a = "a";
    public final String b = "b";
    public static final String c;
    public final String d;

    static {
        c = "c";
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer == 2) return;
                System.out.println(integer);
            }
        });
        aaa = 22 + 33;
        final int kkk = 22 + 3 > 5 ? 111 : 222;
        System.out.println(kkk);
        final int jjj;
        if(1>0) jjj = 333;
        else jjj = 444;
        System.out.println(jjj);
    }

    public JavaMain() {
        d = "";
    }
}

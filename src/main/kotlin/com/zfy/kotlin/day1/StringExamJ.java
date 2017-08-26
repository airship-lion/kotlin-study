package com.zfy.kotlin.day1;

/**
 * Created by bahamut on 2017/8/24.
 * Desc
 */
public class StringExamJ {

    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println("$e");
//        String c = """Hello
//               sdf""" ;
        Parent parent=new Son();
        if (parent instanceof Son) {
            System.out.println(((Son) parent).getName());
        }
    }

}

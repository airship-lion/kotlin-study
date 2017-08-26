package com.zfy.kotlin.day2;

/**
 * Created by bahamut on 2017/8/26.
 * Desc
 */

public class SwitchJ {
    public void onClick(int state) {
        switch (state) {
            case 1:
                System.out.println(111);
            case 2:
                System.out.println(222);
                break;
            case 3:
            case 4:
                System.out.println(333);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

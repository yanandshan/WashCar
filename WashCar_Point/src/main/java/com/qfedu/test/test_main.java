package com.qfedu.test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 20:53
 */
public class test_main {
    public static void main(String[] args) {
        Timer timer = new Timer("test01");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("同桌，喊我一下！"+System.currentTimeMillis()/1000);
            }
        },1000,5000);
    }
}


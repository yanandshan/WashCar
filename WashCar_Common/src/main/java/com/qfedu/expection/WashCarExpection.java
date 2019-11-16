package com.qfedu.expection;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:01
 */
public class WashCarExpection extends Exception {
    public WashCarExpection(){
        super("洗洗车出现了异常");
    }
    public WashCarExpection(String msg){
        super(msg);
    }
}

package com.qfedu.myenum;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:18
 */
public enum ResultCode {
    SUCCESS(200),FAIL(400);
    private int code;
    private ResultCode(int v){
        code=v;
    }
    public int getCode(){
        return code;
    }
}

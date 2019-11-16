package com.qfedu.vo;

import com.qfedu.myenum.ResultCode;
import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:04
 */
@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success(String msg, Object object) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result success(Object obj) {
        return success("OK", obj);
    }

    public static Result success() {
        return success(null);
    }

    public static Result fail() {
        return fail("FAIL");
    }

    public static Result fail(String msg) {

        Result result = new Result();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(msg);
        result.setData(null);
        return result;
    }


    public static Result setResult(boolean issuccess, Object obj) {
        if (issuccess) {
            return success(obj);
        } else {
            return fail();
        }
    }
}

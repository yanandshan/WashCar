package com.qfedu.myenum;

public enum LogType {
    XiChe("洗车"), DingDan("订单"), PingJia("评价");
    private String type;

    private LogType(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

}

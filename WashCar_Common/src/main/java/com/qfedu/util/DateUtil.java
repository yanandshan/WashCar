package com.qfedu.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-07 17:05
 */
public class DateUtil {
    //获取指定天数
    public static String getTime(int days){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,days);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static void main(String[] args) {
        System.out.println(getTime(-7));
        System.out.println("***************************");
    }
}

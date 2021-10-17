package com.rxy.demoClass;
/*
java.util.Date：表示时间和日期的类
类Date：表示特定的瞬间，精确到毫秒；
1秒=1000毫秒
特定的瞬间：
2088-8-8 00：00：00 瞬间

毫秒值的作用：可以对时间日期进行计算
2099-9-9 到 2088-8-8 有多少天
可以将日期转换为毫秒进行计算，计算完毕可以将毫秒转换为日期

把日期转换为毫秒：
    当前时间：2088-8-8 00：00：00
    时间原点：1970-1-1 00：00：00（英国格林威治）
    计算当前日期到时间原点经历多少毫秒（1632103426037）
    注意：
    中国属于东八区，会把时间增加8小时
    时间原点：1970-1-1 08：00：00

把毫秒转换为日期：
    1天=24 x 60 x 60=86400秒  =86400 x 1000= 86400000毫秒

 */

public class DemoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970-1-1 00：00：00经历了多少毫秒；
    }
}
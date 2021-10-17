package com.rxy.demoClass;

import java.util.Date;

/*
Date():获取当前系统时间
Date(long date):传递毫秒值，把毫秒转换为Date日期
Date类的成员方法：long getTime():把日期转换为毫秒：返回自1970-1-1 00：00：00 GMT以来此Date对象表示的毫秒数

 */
public class Demo01Date {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);//Mon Sep 20 10:28:40 CST 2021
        System.out.println("===================");

        Date d2=new Date(0l);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970
        System.out.println("===================");

        Date d3=new Date(123456789l);
        System.out.println(d3);//Fri Jan 02 18:17:36 CST 1970
        System.out.println("===================");

        Date d4=new Date();
        long time=d4.getTime();
        System.out.println(time);//1632105356561

    }
}

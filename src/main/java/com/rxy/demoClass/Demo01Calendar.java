package com.rxy.demoClass;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的成员方法：
    -public int get(int field):返回给定日期字段的值，返回值的结果也是个int类型的值
    -public void set(int field,int value):将给定的日历字段设置为给定值
    -public abstract void add(int field,int amount):根据日历规则，为给定的日历字段添加或减去指定的时间量
    -public Date getTime():把日历对象转换成Date日期对象,返回一个表示Calendar时间值（从历元到现在的毫秒偏移量）的Date对象

    成员方法参数：
        int field:日历类的字段，可以使用Calendar类的静态成员变量获取

　　
 */
public class Demo01Calendar {
    public static void main(String[] args) {
//        demo();
//        demo01();
//        demo02();
        demo03();
    }
/*
    public Date getTime():把日历对象转换成Date日期对象,返回一个表示Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
    参数：
 */
    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();

        System.out.println(time);


    }

    /*
        public abstract void add(int field,int amount):根据日历规则，为给定的日历字段添加或减去指定的时间量
        参数：
            int field：传递指定的日历字段（YEAR、MONTH...）
            int amount:增加/减少的值
                正数：增加的值
                负数：减少的值
     */
    private static void demo02() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);//增加2年
        c.add(Calendar.MONTH,-1);//减少1月

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }

    /*
        public void set(int field,int value):将给定的日历字段设置为给定值
        参数：
            int field：传递指定的日历字段（YEAR、MONTH...）
            int value：传递的字段设定的值
     */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);//设置年：9999
        c.set(Calendar.MONTH,9);//设置月：9（如超过11，则会自动进1年）
        c.set(Calendar.DATE,9);//设置日：9

        //同时设置年月日，set的重载方法
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

//        int date = c.get(Calendar.DATE);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }

    /*
        public int get(int field):返回给定日期字段的值
        参数：传递指定的日历字段（YEAR、MONTH...）
        返回值：日历字段代表具体的值

     */
    private static void demo() {
        //使用getInstance()方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);//西方：0-11，东方：1-12

//        int date = c.get(Calendar.DATE);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }
}

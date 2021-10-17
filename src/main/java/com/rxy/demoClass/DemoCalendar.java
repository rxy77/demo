package com.rxy.demoClass;

import java.util.Calendar;

/*
    java.util.Calendar日历类
    Calendar类是日历类，里面提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR)
    Canlendar类无法直接创建对象使用，里面有个静态方法叫Instance()方法，可以返回Calendar类中的子类对象
    static Calendar getInstance()使用默认时区和语言环境获得一个日历

 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);//
    }
}

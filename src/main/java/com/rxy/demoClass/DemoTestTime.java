package com.rxy.demoClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
    使用日期时间API，计算出生到目前日期，共有多少天

    1、使用Scanner类的next方法，获取出生日期
    2、创建DateFormat类的parse方法，把字符串的出生日期格式解析为"yyyy-MM-dd"
    3、把Date格式的出生日期转换为毫秒值
    4、获取当前日期转换为毫秒值
    5、使用当前日期-出生日期的毫秒值
    6、把差值换算为天（s/1000/60/60/24）

 */
public class DemoTestTime {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类的next方法，获取出生日期
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期，格式：yyyy-MM-dd");
        String brithdayDateString =sc.next();
        // 2、创建DateFormat类的parse方法，把字符串的出生日期格式解析为"yyyy-MM-dd"
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date brithdayDate=sdf.parse(brithdayDateString);
        // 3、把Date格式的出生日期转换为毫秒值
        long brithdayDateTime=brithdayDate.getTime();
        //4、获取当前日期转换为毫秒值
        long todayTime=new Date().getTime();
        //5、使用当前日期-出生日期的毫秒值
        long time=todayTime-brithdayDateTime;
        //6、把差值换算为天（s/1000/60/60/24）
        System.out.println(time/1000/60/60/24);

    }
}

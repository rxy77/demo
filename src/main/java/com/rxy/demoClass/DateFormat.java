package com.rxy.demoClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat类:是日期/时间格式化子类的抽象类
    作用：
    格式化（日期 --> 文本）、解析（文本 --> 日期）
    成员方法：
    String format()
    Date parse()

DateFormat类是抽象类，无法直接创建对象，可以使用DateFormat类的子类

java.text.SimpleDateFormat extends DateFormat

构造方法：
    SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat.
    参数：
    String pattern:传递指定的模式
    模式：区分大小写
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
    写对应的模式，会把模式替换为相应的日期：
    "yyyy-MM-dd HH:mm:ss"
    "yyyy年MM月DD天 HH时：mm分：ss秒"

    注意：
    模式中的字母不能更改，连接模式的符号可以改变

 */
public class DateFormat {
    public static void main(String[] args) throws ParseException {
//        demo01();
        demo02();

    }

    /*
        使用DateFormat类中的format方法，将日期格式化为文本
        String format(Date date):按照指定模式，将Date日期，格式化为符合模式的字符串
        使用步骤：
        1、创建SimpleDateFormat对象，构造方法中传递指定模式
        2、调用SimpleDateFormat对象中的format方法，按照构造方法中指定的模式，将Date日期格式化为符合模式的字符串（文本）


     */
    public static void demo01(){
        //1、创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy年MM月DD天 HH时：mm分：ss秒");
        //2、调用SimpleDateFormat对象中的format方法，按照构造方法中指定的模式，将Date日期格式化为符合模式的字符串（文本）
        Date date=new Date();
        String text=sdf.format(date);
        String text1=sdf1.format(date);

        System.out.println(date);//Mon Sep 20 11:14:58 CST 2021
        System.out.println(text);//2021-09-20 11:14:58
        System.out.println(text1);//2021年09月263天 11时：16分：54秒

    }

  /*
    使用DateFormat类中的parse方法，将日期格式化为文本
    Date parse(String source):把符合模式的字符串，解析为Date日期
    使用步骤：
            1、创建SimpleDateFormat对象，构造方法中传递指定模式
            2、调用SimpleDateFormat对象中的parse方法，把符合构造方法中模式的字符串，解析为Date日期
    注意：
            public Date parse(String source) throws ParseException
            parse方法声明了一个异常：ParseException解析异常
            如果字符串和构造方法中的模式不一样，程序就会抛出异常
            调用一个抛出异常的方法，就必须处理这个异常，要么throws继续声明抛出这一个异常，要么try...catch自己处理这个异常



  */
    public static void demo02() throws ParseException {
        //1、创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月DD天 HH时：mm分：ss秒");
        //2、调用SimpleDateFormat对象中的parse方法，把符合构造方法中模式的字符串，解析为Date日期
        Date date = sdf.parse("2021年09月263天 11时：16分：54秒");//如果字符串和构造方法中的模式不一样，程序就会抛出异常
        System.out.println(date);

    }
}

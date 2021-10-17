package com.rxy.demoClass;

import java.util.Locale;

/*
    StringBuilder类的常用方法：
        public StringBuilder append(String str)：添加任意类型数据的字符串形式，并返回当前对象本身
        参数：
            任意的数据类型
        public StringBuilder append(String str) {
            super.append(str);
            return this;
        }

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();

        //使用append方法往StringBuilder中添加数据
        //append返回的是this，就是对象自己，调用的对象bu1
        /*StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);*///true，两个对象是同一个对象

        //使用append方法无需接受值
        /*bu1.append("abc");
        bu1.append(1);
        bu1.append(true);
        bu1.append(10.1);
        bu1.append('中');
        System.out.println(bu1);*/

        /*
        链式编程，方法的返回值是一个对象，可以根据对象继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase().toUpperCase());
        bu1.append("abc").append(1).append(true).append(10.10).append('中');
        System.out.println(bu1);//abc1true10.1中


    }
}

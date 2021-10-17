package com.rxy.demoClass;

import java.util.Random;

public class DemoEquals {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object中的equals方法
        boolean equals(Object obj)指示其他对象与该对象是否"相等"
        Object类equals方法的源码：
        public boolean equals(Object obj) {
        return (this == obj);
        }
        参数：
            Object obj 可以传递任意的对象
        方法体：
            ==：比较运算符，返回的就是一个布尔值：true，false
            基本数据类型：比较的是值
            引用数据类型：比较的是地址值
            this是谁？
            哪个对象调用的方法，方法中的this就是哪个对象；p1调用的方法，this就是p1
            Object是谁？
            传递过来的参数p2
            this==obj  --->  p1==p2

         */
        Person p1=new Person("迪丽热巴",21);
        Person p2=new Person("古力娜扎",21);

        p1=p2;//把p2的地址值赋给p1，所以equals返回true



        System.out.println("p1"+p1);//p1com.rxy.demoClass.Person@6e8cf4c6
        System.out.println("p2"+p2);//p2com.rxy.demoClass.Person@12edcd21

        Random r=new Random();

//        boolean b=p1.equals(r);
//        boolean b=p1.equals(null);
        boolean b=p1.equals(p2);
        System.out.println(b);

    }
}

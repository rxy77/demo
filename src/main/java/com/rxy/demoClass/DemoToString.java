package com.rxy.demoClass;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DemoToString {
    public static void main(String[] args) {
        Person p=new Person("张三",26);

        /*
        Person类默认继承了Object类，所以可以使用Object中的toString方法
        String toString()方法返回该对象的字符串表示
         */

        System.out.println(p.toString());//默认的toString()方法，打印的是地址值。
        // com.rxy.demoClass.Person@7cc355be，包路径+地址值｜ Person{name='张三', age='26'}
        System.out.println(p);//直接打印==直接调用p.toString()

        /*
        看一个类是否重写了toString()，直接打印这个对象的名字即可
        如果没有重写toString()，那么打印的就是对象的地址值
        如果重写toString()，那么就按照值重写的方式打印
        */

        Random r=new Random();
        System.out.println(r);//java.util.Random@506e1b77

        Scanner s=new Scanner(System.in);
        System.out.println(s);//java.util.Scanner[delimi...
        //Scanner()重写了toString()

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2]
        //ArrayList<> 重写了toString()

    }
}

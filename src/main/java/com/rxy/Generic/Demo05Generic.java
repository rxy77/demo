package com.rxy.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
    泛型通配符：
        ？：代表任意数据类型
    使用方法：
        不能创建对象使用
        只能作为方法的参数
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("你好");
        list02.add("测试");

        print(list01);
        print(list02);

//        ArrayList<?> list03=new ArrayList<?>();//创建对象时不能使用
    }

    /*
        定义一个方法，可以接收任意ArrayList集合
        不确定ArrayList集合使用的是什么类型时，可以使用泛型的通配符？来接收数据
        注意：
            泛型没有继承概念
     */
    private static void print(ArrayList<?> list) {
        //用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();//取出的元素是Object,可以接收任意数据类型
            System.out.println(o);
        }
    }


}

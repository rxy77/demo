package com.rxy.demo.Demo01;

import java.util.ArrayList;
//从JDK 1.5+ 自动装箱 自动拆箱
//自动装箱 基本类型 --> 包装类型
//自动拆箱 包装类型 --> 基本类型
public class Demo04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listC=new ArrayList<>();

        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num=listC.get(1);
        System.out.println("第1号元素是："+num);
    }
}

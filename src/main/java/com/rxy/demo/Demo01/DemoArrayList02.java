package com.rxy.demo.Demo01;

import java.util.ArrayList;

public class DemoArrayList02 {
    public static void main(String[] args) {
        //创建ArrayList集合，集合名称为list，里面全是String类型数据
        //备注：从jdk1.7+后，右侧<>李可以不写内容，但<>本身要写
        ArrayList<String> list=new ArrayList<>();

        System.out.println(list);//直接打印ArrayList对象得到的不是地址值，而是内容；无内容则是：[]

        list.add("迪丽热巴");

        System.out.println(list);

        list.add("古力娜扎");
        list.add("玛尔扎哈");

        System.out.println(list);

//        list.add(100);//错误写法，因为全是String


        System.out.println("==================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

package com.rxy.demo.Demo01;

import java.util.ArrayList;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        boolean success=list.add("古力娜扎");

        System.out.println("添加是否成功："+success);//对于String类型，添加一定成功，但对别的类型不一定
        System.out.println(list);

        System.out.println("==============");

        list.add("玛尔扎哈");
        list.add("高圆圆");

        System.out.println(list);

        System.out.println("==============");
        String name=list.get(1);
        System.out.println(name);

        System.out.println("==============");
        String removed=list.remove(1);
        System.out.println("被删除的是："+removed);
        System.out.println(list);
    }
}

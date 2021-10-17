package com.rxy.demo.Demo01;

import java.util.ArrayList;
//将[元素,元素,元素]
//转换{元素@元素@元素}
public class Demo05ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("鹿晗");
        list.add("吴亦凡");
        list.add("张三丰");


        printArrayList(list);


    }

    private static void printArrayList(ArrayList<String> list){

        System.out.print("{");
        for (int i = 0; i < 3; i++) {
            String name=list.get(i);
            if (i==list.size()-1) {
                System.out.println(name+"}");
            }else {
                System.out.print(name+"@");
            }
        }

    }
}

package com.rxy.demoClass;

import java.util.ArrayList;
/*
    自动装箱与自动拆箱：
        基本类型数据与包装类之间自动转换
        JDK1.5之后的特性
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
            自动装箱：直接把int类型的数据赋值给包装类
            Integer in=1; 就相当于 Integer in=new Integer(1);
         */
        Integer in=1;
        /*
            自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型数据，再参与计算
            in + 2； 就相当于 in.intValue() + 2 = 3;
            in=in+2; 就相当于 in =new Integer(3);自动装箱
         */
        in=in+2;
        System.out.println(in);

        //ArrayList集合无法直接存储整数类型，可以存储Integer包装类
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);//list.add(new Integer(1)); 自动装箱

        int a = list.get(0);//list.get().intValue(); 自动拆箱


    }
}

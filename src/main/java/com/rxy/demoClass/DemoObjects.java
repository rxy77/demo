package com.rxy.demoClass;

import java.util.Objects;
import java.util.function.Predicate;

public class DemoObjects {
    public static void main(String[] args) {
        String p1="abc";
        String p2="abc";
        String p3=null;

//        boolean b=p1.equals(p2);
//        System.out.println(b);
//
//        boolean c=p2.equals(p3);//null不能调用方法，会空指针异常
//        System.out.println(c);

        /*
        Objects类equals()方法,对两个对象进行比较，防止空指针异常
        public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
        }
         */
        boolean c1= Objects.equals(p2,p3);
        System.out.println(c1);
    }
}

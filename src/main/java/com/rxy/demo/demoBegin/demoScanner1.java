package com.rxy.demo.demoBegin;

import java.util.Scanner;

public class demoScanner1 {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        System.out.println("输入的是："+str);

        //匿名对象使用方式
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);

        //一般写法传入参数
//        Scanner sc=new Scanner(System.in);
//        method(sc);

        //匿名对象传入参数
//        method(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static void method(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);//匿名对象作为返回值
    }
}

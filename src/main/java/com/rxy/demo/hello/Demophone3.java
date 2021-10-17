package com.rxy.demo.hello;

public class Demophone3 {
    public static void main(String[] args) {
        phone one=new phone();
        one.color="blue";
        one.price=8388.0;
        one.brand="apple";

        method(one);
    }
    public static void method(phone param){
        System.out.println(param.price);
        System.out.println(param.brand);
        System.out.println(param.color);
    }
}

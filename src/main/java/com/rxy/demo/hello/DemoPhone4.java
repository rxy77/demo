package com.rxy.demo.hello;

public class DemoPhone4 {
    public static void main(String[] args) {
        phone two=getPhone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);


    }

    public static phone getPhone(){
        phone one=new phone();
        one.brand="apple";
        one.price=8388.0;
        one.color="blue";

        return one;
    }
}

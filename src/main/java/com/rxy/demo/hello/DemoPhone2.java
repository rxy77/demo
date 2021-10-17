package com.rxy.demo.hello;


public class DemoPhone2 {
    public static void main(String[] args) {
        phone one=new phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===========================");
        one.brand="苹果";
        one.price=8399.0;
        one.color="黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.call("乔布斯");
        one.message();
        System.out.println("===========================");
        phone two=one;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.brand="samsung";
        two.price=2000.0;
        two.color="绿色";
        System.out.println("===========================");
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        one.call("欧巴");
        one.message();

    }

}

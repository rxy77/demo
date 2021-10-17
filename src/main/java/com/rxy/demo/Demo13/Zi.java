package com.rxy.demo.Demo13;

public class Zi extends Fu{
//    @Override//成员变量不能覆盖重写
    int num=20;
    int age=19;
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }
}

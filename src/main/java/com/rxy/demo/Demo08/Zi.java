package com.rxy.demo.Demo08;

public class Zi extends Fu{

    public Zi(){
        //super
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}

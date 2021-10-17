package com.rxy.demo.Demo16;

public class Zi extends Fu{
    @Override
    public void methodAb() {

    }
    //错误写法，不能覆盖重写父类中final修饰的方法
    /*@Override
    public void method() {
        System.out.println("子类覆盖重写父类方法！");
    }*/
}

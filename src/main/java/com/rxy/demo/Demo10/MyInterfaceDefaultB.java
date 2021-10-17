package com.rxy.demo.Demo10;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现B覆盖重写接口的默认方法");
    }
}

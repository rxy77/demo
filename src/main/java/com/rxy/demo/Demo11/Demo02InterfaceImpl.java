package com.rxy.demo.Demo11;

public class Demo02InterfaceImpl /*extends Object*/ implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B的抽象方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写A的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对接口当中默认方法进行的覆盖重写");
    }
}

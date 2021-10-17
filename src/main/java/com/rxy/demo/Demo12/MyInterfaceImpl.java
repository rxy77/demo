package com.rxy.demo.Demo12;
/*
类与类之间是单继承的，直接父类只有一个
类与接口之间是多实现的，一个类可以有很多个接口
接口与接口之间是多继承的

注意事项：
1、多个父接口当中的抽象方法重复，没关系
2、多个父接口当中的默认方法重复，子接口必须覆盖重写默认方法，【而且必须带上default关键字】
 */
public class MyInterfaceImpl implements MyInterface{
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodCommon() {

    }

    @Override
    public void method() {

    }
}

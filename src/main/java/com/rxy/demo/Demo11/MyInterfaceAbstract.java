package com.rxy.demo.Demo11;

public abstract class MyInterfaceAbstract implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        InterfaceA.super.methodDefault();
    }
}

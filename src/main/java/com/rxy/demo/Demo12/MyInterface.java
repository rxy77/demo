package com.rxy.demo.Demo12;

public interface MyInterface extends InterfaceA,InterfaceB{
    public abstract void method();

    public default void methodDefault(){
        System.out.println("默认方法");
    }
}

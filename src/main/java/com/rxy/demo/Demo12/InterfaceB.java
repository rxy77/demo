package com.rxy.demo.Demo12;

public interface InterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("默认方法B");
    }
}

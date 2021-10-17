package com.rxy.demo.Demo12;

public interface InterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("默认方法A");
    }

}

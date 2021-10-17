package com.rxy.demo.Demo10;
/*
从java8开始，接口允许定义默认方法
格式：
public default 返回值类型 方法名称(){
    //方法体
}

备注：接口的默认方法，可以解决接口的升级问题*/
public interface MyInterfaceDefault {
    public abstract void methodAbs();

    //新添加的抽象方法
//    public abstract void method2();

    //把新添加的抽象方法，变成默认方法。
    public default void methodDefault(){//public可以省略，但不可以修改为别的关键字
        System.out.println("这是新添加的默认方法");
    }
    public default void methodDefault1(){
        System.out.println("这是第二个默认方法");
    }
}

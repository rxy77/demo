package com.rxy.demo.Demo10;
/*
问题描述：
我们需要抽取一个共有方法，用来解决两个默认方法中重复代码问题
但这个共有方法不应该让实现类调用，应该是私有化

解决方案：
从java9开始，允许接口定义私有化方法
1、普通私有方法，解决多个默认方法的重复代码问题
格式：
private 返回值类型 方法名称(参数列表){
    //...
}
2、静态私有方法，解决多个静态方法的重复代码问题
格式：
private static 返回值类型 方法名称(参数列表){
    //...
}

*/
public interface MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

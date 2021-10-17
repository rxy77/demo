package com.rxy.demo.Demo10;
/*
定义一个接口格式：
public interface 接口名称{
    //接口内容
}

接口名称依然驼峰定义
备注：换成了interface关键字，编译生成的字节码文件依然是：.java->.class

如果是java7，接口内容有：
1、常量
2、抽象方法

如果是java8，额外内容有：
1、默认方法
2、静态方法

如果是java9，额外内容有：
1、私有方法

接口使用步骤：
1、接口不能直接使用，必须创建一个"实现类"来"实现"该接口
格式：
public class 实现类名称 implements 接口名称{
    //...
}
2、接口的实现类必须覆盖重写(实现)接口所有抽象类
实现：去掉abstract，加上方法体大括号
3、创建实现类对象，使用

注意事项：
如果实现类没有覆盖重写(实现)接口中所有的抽象方法，那这个实现类就必须是抽象类*/
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法，不能直接new接口对象
//        MyInterfaceAbstract inter=new MyInterfaceAbstract();

        MyInterfaceAbstractImpl inter=new MyInterfaceAbstractImpl();
        inter.methodAbs1();
        inter.methodAbs2();

    }
}

package com.rxy.demo.Demo10;
/*
1、接口的默认方法，可以通过实现类对象，直接调用
2、接口的默认方法，也可以被接口实现类进行覆盖重写*/
public class Demo02Interface{
    public static void main(String[] args) {
        MyInterfaceDefaultA interA=new MyInterfaceDefaultA();
        interA.methodAbs();//调用抽象方法，实际运行的是右侧实现类
        interA.methodDefault();
        interA.methodDefault1();
        System.out.println("======================");

        MyInterfaceDefaultB interB=new MyInterfaceDefaultB();
        interB.methodAbs();
        interB.methodDefault();
        interB.methodDefault1();

    }
}

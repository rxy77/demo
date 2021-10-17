package com.rxy.demo.Demo06;
/*
super关键字三种用法：
1、在子类成员方法中，访问父类的成员变量。
2、在子类成员方法中，访问父类的成员方法。
3、在子类的构造函数中，访问父类的构造方法。
*/
public class Zi extends Fu{
    int num=20;
    public Zi(){
        super();
    }
    public void methodZi(){
        System.out.println(super.num);
    }
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}

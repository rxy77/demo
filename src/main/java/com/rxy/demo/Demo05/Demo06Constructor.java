package com.rxy.demo.Demo05;
/*
继承关系中，父子类构造方法访问特点：

1、子类构造方法中又一个默认隐含的调用方法"super()"，所以一定先调用父类构造方法，在调用子类构造方法
2、子类构造方法可以通过super关键字来调用父类重载构造
3、super()的父类构造调用，必须是子类构造的第一个语句，不能一个子类调用多次super构造
总结：
子类必须调用父类的构造方法，不写则赠送super()调用，写了则使用写的super，super只能有一个，而且必须是第一个
*/
public class Demo06Constructor {
    public static void main(String[] args) {
        Zi zi=new Zi();

    }
}

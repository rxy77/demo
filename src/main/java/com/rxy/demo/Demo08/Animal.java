package com.rxy.demo.Demo08;
/*
抽象方法：就是加上abstract关键字，去掉大括号，直接分号结束。
抽象类：抽象方法必须在抽象类当中，在class前加上abstract即可。(抽象类中不一定有抽象方法，但抽象方法必须在抽象类中)

如何使用抽象类和抽象方法：
1、不能直接创建new抽象类对象
2、必须使用子类来继承抽象父类
3、子类必须覆盖重写(实现)抽象类当中的所有抽象方法：去掉abstract，加上方法体大括号。(除非子类也是抽象类)
4、创建子类对象使用*/
public abstract class Animal {
    //这是一个抽象方法,代表吃东西，但是具体怎么吃(大括号内容)，不确定。
    public abstract void eat();
    //这是一个普通方法
   /* public void normalMethod(){

    }*/
}

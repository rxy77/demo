package com.rxy.demo.Demo05;

/*
局部变量：   直接写成员变量
本类变量：   this.成员变量
父类变量：   super.成员变量
*/
public class Zi extends Fu{
//    int numZi=20;
//    int num=200;


    public Zi(){
//        super();//父类无参构造!!并且构造只能调用一次!!而且只有第一个有效!!
        super(10);
        System.out.println("子类构造方法执行！");
    }

   /* public void methodZi(){
        System.out.println("子类方法执行！");
    }
    @Override
    public void method(){
        System.out.println("子类重名方法执行！");
    }*/
}

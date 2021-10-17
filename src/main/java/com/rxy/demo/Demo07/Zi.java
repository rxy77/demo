package com.rxy.demo.Demo07;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法有三种：

1、在本类成员方法中，访问本类的成员变量。
2、在本类成员方法中，访问本类另一个成员变量。
3、在本类构造方法中，访问本类另一个构造方法。

注意：
1、this(...)调用也必须是构造方法中的第一个语句，唯一一个。
2、super和this不可同时调用。
 */
public class Zi extends Fu{
    int num=20;
    public Zi(){
        this(20);
        System.out.println("无参执行");

    }
    public Zi(int n){
        this(1,2);
        System.out.println("单参执行");
    }
    public Zi(int n,int m){
        super();
        System.out.println("两参执行");
    }

    public void showNum(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

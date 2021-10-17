package com.rxy.demo.Demo17;
/*
一个事物包含另一个事物；一个类包含另一个类
例如：身体和心脏

成员内部类格式：
修饰符 class 类名称{
    修饰符 class 类名称{
        //...
    }
    //...
}

注意：内用外，随意访问；外用内，需访问内部类对象

=============================================
使用成员内部类的两种方式：
1、间接访问：在外部类的方法中，使用内部类，通过main方法调用外部类方法
2、直接访问：公式：
类名称 对象名=new 类名称();
【外部类名称.内部类名称 对象名=new 外部类名称().new 内部类名称()；】

 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body=new Body();//创建外部类对象
        // 通过外部类的对象，访问外部类的方法，里面间接使用内部类Heart
        body.methodBody();
        System.out.println("====================");

        // 按照公式：
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}

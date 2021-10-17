package com.rxy.demo.Demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //  设置教室，因为是静态的，推荐用类名称调用
        Student.room="101教室";

        Student one=new Student("郭靖",20);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室："+Student.room);
        System.out.println("===================");

        Student two=new Student("黄蓉",19);
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        System.out.println("two的教室："+Student.room);

    }
}

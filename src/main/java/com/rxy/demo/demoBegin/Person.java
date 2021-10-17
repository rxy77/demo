package com.rxy.demo.demoBegin;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("无参构造函数");
    }
    public Person(String name,int age){
        System.out.println("全参构造函数");
    }
    public void sayhello(String name){
        System.out.println(name+",你好。我是"+this.name);
    }
}

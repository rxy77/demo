package com.rxy.demo.hello;
//问题描述：定义person的数据时，无法阻止不合理的数据。
//解决方案：用private关键字对成员变量进行修饰
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我的名字："+name+",年龄："+age);
    }
    //这个成员方法，用于设置age数据
    public void setAge(int num){
        if(num<100&&num>0){//如果是合理情况
            age=num;
        }else{
            System.out.println("age数据不合理！");
        }
    }
    //这个成员方法，用于获取age数据
    public int getAge(){
        return age;
    }
}

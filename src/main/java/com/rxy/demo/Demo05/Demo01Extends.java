package com.rxy.demo.Demo05;
/*在继承关系中，"子类就是一个父类"，也就是说，子类可以被看作一个父类
例如：父类是员工，老师是子类，那么"老师是一个员工"，关系：is-a

定义父类格式（普通类的定义）
public class 父类名称(){
        //..
}

定义子类格式：
public class 子类名称 extends 父类名称(){
        //..
}*/
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象，
        Teacher teacher=new Teacher();
        //虽然Teacher类什么都没写，但继承了父类的方法
        teacher.mathod();

        //创建一个子类的助教对象
        Assistant assistant=new Assistant();
        assistant.mathod();
    }
}

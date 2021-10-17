package com.rxy.demo.Demo03;
/*如果一个成员变量使用static关键字，则此变量不再属于对象自己，而属于所在类，多个对象共享一个数据*/
public class Demo01StaticField {
    public static void main(String[] args) {

        Student two=new Student("黄蓉",21);
        two.room="101教室";
        System.out.println("姓名："+two.getName()+",年龄："+two.getAge()+",所在教室："+two.room+",学号："+two.getId());
        Student one=new Student("郭靖",20);
        System.out.println("姓名："+one.getName()+",年龄："+one.getAge()+",所在教室："+one.room+",学号："+one.getId());

    }

}

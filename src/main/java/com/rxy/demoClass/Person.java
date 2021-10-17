package com.rxy.demoClass;

import lombok.Data;
import lombok.ToString;

import java.util.Objects;

//@Data
//@ToString
public class Person {
    private String name;
    private int age;


    //直接打印对象的地址值没有意义，需要重写Object类的toString()方法
    // 打印对象的属性(name，age)
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                '}';
//    }

    /*
    Object类equals()默认比较的是两个对象的地址值，没有意义
        所以需要重写equals，比较两个对象的属性值(name,age)
        对象的属性值一样，返回true，否则返回false
    问题：
        隐含着多态：
        Object obj = p2 = new Person("古力娜扎",21);
        多态弊端：无法使用子类特有内容(属性，方法)
        解决：向下转型(强转)，把Object类型 强制转换为Person

    */

   /* @Override
    public boolean equals(Object obj) {
        *//*
        增加一个判断，如果obj为null，直接返回false，提高程序效率
         *//*
        if(obj==null)return false;

        *//*
        增加一个判断，如果obj为对象本身，直接返回true,提高程序效率
         *//*
        if(obj==this)return true;

        if(obj instanceof Person){
            //向下转型(强转)把object类转换为Person
            Person p=(Person) obj;
            //比较两个对象的属性；一个是调用方法的this(p1),一个就是p(obj=p2)
            boolean b=this.name.equals(p.name)&&this.age==p.age;
            return b;
        }else {
            //不是Person类型，返回false
            return false;
        }

    }*/

   /* @Override
    public boolean equals(Object o) {
        //getClass() != o.getClass()使用反射技术，等效于obj instanceof Person
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

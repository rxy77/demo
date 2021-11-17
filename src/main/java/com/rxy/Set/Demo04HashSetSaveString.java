package com.rxy.Set;

import java.util.HashSet;
/*
    HashSet存储自定义类型元素

    set集合报错元素唯一：
        存储的元素（String，Integer，...,Student,Person）,必须重写HashCode和equals方法

    要求：
        同名同年龄的人，视为同一个，只能存储一次
 */
public class Demo04HashSetSaveString {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("迪丽热巴",28);
        Person p2 = new Person("迪丽热巴",28);
        Person p3 = new Person("迪丽热巴",30);

        System.out.println(p1==p2);//false,不是一个东西，地址值不同，比较的是地址值
        System.out.println(p1.equals(p2));//true
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);

    }
}

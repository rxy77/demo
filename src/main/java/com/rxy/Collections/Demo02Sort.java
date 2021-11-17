package com.rxy.Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
    java.util.Collections是集合工具类，是用来对集合进行操作，部分方法：
        public static <T> void sort(List<T> list);将集合中元素按照默认规则排序
    注意：
        sort(List<T> list)使用前提：
            被排序集合中的元素，必须实现Comparable，重写方法中的方法compareTo定义排序规则
    Comparable接口排序规则：
        自己(this)-参数：升序
        参数-自己(this)：降序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,3,2,4);
        System.out.println(list01);//[1, 3, 2, 4]
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3, 4]

        ArrayList<String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","c","b","A","D");
        System.out.println(list02);
        Collections.sort(list02);//[a, c, b, A, D]
        System.out.println(list02);//[A, D, a, b, c]

        ArrayList<Person> people = new ArrayList<>();
        Collections.addAll(people,new Person("张三",20),new Person("王五",23),new Person("李四",22));
//        people.add(new Person("张三",20));
//        people.add(new Person("王五",23));
//        people.add(new Person("李四",22));
        System.out.println(people);//[Person(name=张三, age=20), Person(name=王五, age=23), Person(name=李四, age=22)]
        Collections.sort(people);
        System.out.println(people);//[Person(name=张三, age=20), Person(name=李四, age=22), Person(name=王五, age=23)] 按照年龄升序
    }
}

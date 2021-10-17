package com.rxy.demo.Demo01;

import java.util.ArrayList;

public class Demo04ListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("鹿晗",20);
        Student two=new Student("吴亦凡",21);
        Student three=new Student("张磊",22);
        Student four=new Student("张艺兴",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < 4; i++) {
            Student stu=list.get(i);
            System.out.println("姓名："+stu.getName()+"，年龄："+stu.getAge());
        }
    }
}

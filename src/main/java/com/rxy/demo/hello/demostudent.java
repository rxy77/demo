package com.rxy.demo.hello;


import java.io.*;


public class demostudent {
    public static void main(String[] args) throws FileNotFoundException {
        Student student=new Student();
        student.setAge(20);
        student.setMale(true);
        student.setName("鹿晗");

//        Student student=Student.builder().age(20).male(true).name("鹿晗").build();

        System.out.println("名字： "+student.getName());
        System.out.println("年龄： "+student.getAge());
        System.out.println("是不是男人： "+student.isMale());
        student.test("你好");
        InputStream in=new FileInputStream("file1");
        OutputStream out=new FileOutputStream("file2");
    }
}

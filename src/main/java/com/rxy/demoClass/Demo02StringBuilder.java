package com.rxy.demoClass;
/*
    StringBuilder和String可以相互转换
        String-->StringBuilder：可以使用StringBuilder的构造方法
            public StringBuilder(String str)构造一个字符串生成器（StringBuilder容器），并初始化为指定的字符串内容
       StringBuilder-->String
            public String toString()：将当前的StringBuilder对象转换为String对象
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //String-->StringBuilder
        String str="hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println(bu);
        //StringBuilder-->String
        String s = bu.toString();
        System.out.println(s);


    }
}

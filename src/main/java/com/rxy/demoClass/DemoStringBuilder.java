package com.rxy.demoClass;
/*
    java.long.StringBuilder类：字符串缓冲区，可以提高效率
    构造方法：
        public StringBuilder();构造一个空的StringBuilder容器，其初始容量为16个字符
        public StringBuilder(String str);构造一个StringBuilder容器，并把字符串加进去

 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        //使用空参的构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);//bu1:

        //使用包含字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);//bu2:abc

    }
}

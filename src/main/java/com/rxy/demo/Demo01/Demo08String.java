package com.rxy.demo.Demo01;

public class Demo08String {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char[] charAraay={'a','b','c'};
        String str3=new String(charAraay);

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false
    }
}

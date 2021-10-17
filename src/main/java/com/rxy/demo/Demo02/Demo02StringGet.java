package com.rxy.demo.Demo02;
/*
public int length():获取字符串当中含有字符的个数，获取字符串长度
public String concat(String str):将当前字符串和参数字符串进行拼接形成新的字符串
public char charAt(int index):获取指定索引位置的单个字符(索引从0开始)
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回值-1
*/

public class Demo02StringGet {
    public static void main(String[] args) {
        String str1="asfasg";
        System.out.println("字符串的长度："+str1.length());
        int length = "sdfxcghvbjnl".length();
        System.out.println("字符串的长度："+length);
        System.out.println("=============================");

        String StrA="Hello";
        String StrB="World";
        String StrC=StrA.concat(StrB);
        System.out.println(StrA);
        System.out.println(StrB);
        System.out.println(StrC);
        System.out.println("=============================");

        char ch = "Hello".charAt(1);
        System.out.println("1号索引位置："+ch);
        System.out.println("=============================");

        String original="HelloWorldHelloWorld";
        int llo = original.indexOf("llo");
        System.out.println("llo首次出现位置："+llo);

        String original1="HelloWorldHelloWorld";
        int de = original.indexOf("de");
        System.out.println("llo首次出现位置："+de);
    }
}

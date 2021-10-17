package com.rxy.demo.Demo02;
/*
public String[] split()按照参数规则，将字符串切分为若干份
split()方法的参数实际是一个正则表达式，如果要按照"."进行切分，则必须写"\\."
*/
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc,d";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("======================");

        String str2="aaa bbb ccc d";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("======================");

        String str3="XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("======================");

        String str4="ab,cc,cc,bb,cd";
        String[] array4 = str4.split(",", 4);//limit:分割的份数
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}

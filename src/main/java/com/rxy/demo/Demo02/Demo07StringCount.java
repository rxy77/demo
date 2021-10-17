package com.rxy.demo.Demo02;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input=sc.next();

        int upper=0;
        int lower=0;
        int number=0;
        int other=0;

        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if ('A'<=ch&&ch<='Z'){upper++;}
            else if ('a'<=ch&&ch<='z'){lower++;}
            else if ('0'<=ch&&ch<='9'){number++;}
            else other++;
        }

        System.out.println("数字有："+number+"个");
        System.out.println("大写字母有："+upper+"个");
        System.out.println("小写字母有："+lower+"个");
        System.out.println("其他字符有："+other+"个");

    }
}

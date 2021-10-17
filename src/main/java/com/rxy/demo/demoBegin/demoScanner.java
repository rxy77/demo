package com.rxy.demo.demoBegin;

import java.util.Scanner;

public class demoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1个数字：");
        int a=sc.nextInt();
        System.out.println("请输入第2个数字：");
        int b=sc.nextInt();
        System.out.println("请输入第3个数字：");
        int c=sc.nextInt();

        int temp=a>b? a:b;
        int max=temp>c? temp:c;
        System.out.println("最大值："+max);

    }
}

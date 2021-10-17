package com.rxy.demo.demoBegin;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom1 {
    public static void main(String[] args) {
        Random num=new Random();
        Scanner sc=new Scanner(System.in);

        int result=num.nextInt(100)+1;
        System.out.println("请输入大于0小于100的整数：(10次机会)");

        for (int i = 0; i < 10; i++) {
            int n=sc.nextInt();
            if (n>result){
                System.out.println("太大了");
            }
            if(n<result){
                System.out.println("太小了");
            }
            if (n==result){
                System.out.println("答对了");
                break;
            }
        }



        System.out.println("游戏结束。");
    }
}

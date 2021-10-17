package com.rxy.demo.demoBegin;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r=new Random();

        int num=r.nextInt();

        System.out.println(num);

        System.out.println("以下为循环:");
        for (int i=0;i<100;i++){
            int nu=r.nextInt(100);//0-99 [0,100)作闭右开
            System.out.println(nu);
        }
        System.out.println("======================");
        for (int i = 0; i < 100; i++) {
            int n=5;
            int result=r.nextInt(n)+1;//1-(n+1)、[1,n]、[1,n+1)
            System.out.println(result);
        }
        System.out.println("======================");
        for (int i = 0; i < 100; i++) {
            int n=5;
            int result=r.nextInt(n+1);//0-(n+1)、[0,n]、[0,n+1)
            System.out.println(result);
        }
    }
}

package com.rxy.demo.Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Demo07List {
    public static void main(String[] args) {
        ArrayList<Integer> srcList=new ArrayList<>();
        int sum=0;
        Random r=new Random();

        for (int i = 0; i < 10; i++) {
            int num=r.nextInt(10)+1;
            srcList.add(num);
            sum+=srcList.get(i);
//            System.out.println(srcList.get(i));
        }
//        for (int i = 0; i < 10; i++) {
//
//        }

        System.out.println("和为："+sum);
    }
}

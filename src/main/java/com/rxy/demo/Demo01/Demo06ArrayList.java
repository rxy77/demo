package com.rxy.demo.Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Demo06ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            numList.add(num);
        }
        System.out.println(getSmallList(numList));
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> numList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (numList.get(i)%2==0){
                smallList.add(numList.get(i));
            }
        }
        return smallList;
    }
}

package com.rxy.demo.Demo09;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

//@AllArgsConstructor
@NoArgsConstructor
//群主的类
public class Manager extends User{
    public Manager(String name,int money){
        super(name,money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();

        int LeftMoney=super.getMoney();
        if (totalMoney>LeftMoney){
            System.out.println("余额不足");
        }

        super.setMoney(LeftMoney-totalMoney);

        int avg=totalMoney/ count;
        int mod=totalMoney% count;

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        int last=avg+mod;
        redList.add(last);

        return redList;
    }
}

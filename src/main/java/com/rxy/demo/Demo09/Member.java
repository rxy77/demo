package com.rxy.demo.Demo09;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

@NoArgsConstructor
//@AllArgsConstructor
public class Member extends User{
     public Member(String name,int money){
        super(name,money);
    }
    public void receive(ArrayList<Integer> list){
        int index=new Random().nextInt(list.size());

        int delta = list.remove(index);

        int money=super.getMoney();

        super.setMoney(money+delta);
    }
}

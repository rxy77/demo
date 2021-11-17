package com.rxy.Test;

import java.util.*;

/*
    斗地主综合案例：
    1、准备牌
    2、洗牌
    3、发牌
    4、排序
    5、看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1、准备牌
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //定义一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义2个集合，存储牌的花色和数字
        List<String> colors=List.of("♠️","♦️","♥️","♣️");
        List<String> numbers=List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //把大王小王加入集合中
        //定义一个牌的索引
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //遍历嵌套组装牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        //2、洗牌
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);

        //3、发牌
        //定义4个集合，存储底牌和玩家的牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历牌的索引，获取每一张牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in=pokerIndex.get(i);
            //先判断底牌
            if(i>=51){//底牌
                dipai.add(in);
            }else if (i%3==0){//给玩家1发牌
                player01.add(in);
            }else if (i%3==1){//给玩家2发牌
                player02.add(in);
            }else if (i%3==2){//给玩家3发牌
                player03.add(in);
            }
        }

        //4、排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);//默认升序

        //5、看牌
        lookPoker("刘德华",poker,player01);
        lookPoker("周星驰",poker,player02);
        lookPoker("周润发",poker,player03);
        lookPoker("底牌",poker,dipai);
    }

    /*
        定义一个看牌的方法，提高代码的复用性
        参数：
            String name：玩家名称
            HashMap<Integer, String> poker：存储牌的扑克集合
            ArrayList<Integer> list：存储玩家或底牌的list的集合
        查表法：
            遍历玩家或底牌集合，获取牌的索引
            使用牌的索引，在Map集合中，获取到对应的牌
    */
public static void lookPoker(String name,HashMap<Integer, String> poker,ArrayList<Integer> list){
    System.out.print(name+": ");//输出玩家名称，不换行
    for (Integer key : list) {//遍历玩家或底牌集合，获取索引
        String value = poker.get(key);//使用索引获取value
        System.out.print(value+" ");
    }
    System.out.println();//打印每位玩家的牌后换行
}
}

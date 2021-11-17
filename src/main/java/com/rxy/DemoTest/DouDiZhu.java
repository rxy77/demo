package com.rxy.DemoTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*
    斗地主案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型String
        ArrayList<String> poker = new ArrayList<>();
        //定义2个数组，一个数组存储花色，一个数组存储数字
        String[] colors={"♠️","♦️","♥️","♣️"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王，小王加进poker
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历2个数组，组装牌进poker
        for (String number : numbers) {
            for (String color : colors) {
//                System.out.println(color+number);
                poker.add(color+number);//把装好的牌存储poker集合
            }
        }
//        System.out.println(poker);

        /*
            2.洗牌：
                使用Collections类中的shuffle()
                public static void shuffle(List<?> list)使用默认随机的默认源对指定列表进行置换
         */
        Collections.shuffle(poker);
//        System.out.println(poker);

        /*
            3.发牌
         */
        //创建4个集合，存放玩家和底牌的牌
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3给3个玩家轮流发牌
            剩余3张给底牌
            注意：
                先判断底牌（i>=51），否则牌就没了
         */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if(i>=51){
                dipai.add(p);//给底牌
            }else if (i%3==0){
                play01.add(p);//给玩家1发牌
            }else if (i%3==1){
                play02.add(p);//给玩家2发牌
            }else if(i%3==2){
                play03.add(p);//给玩家3发牌
            }
        }

        //4.看牌
        System.out.println("刘德华："+play01);
        System.out.println("周润发："+play02);
        System.out.println("周星驰："+play03);
        System.out.println("底牌："+dipai);

    }
}

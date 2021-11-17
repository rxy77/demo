package com.rxy.Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V›接口

    Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

    HashMap集合（之前学的所有的集合)：可以存储nuLL值,nuLL键
    Hashtable集合，不能存储nuLL值，nuLL键

    Hashtable和vector集合一样，在jdk1.2版本之后被更先进的集合 (HashMap, Arravl ist)取代了
    Hashtable的子类properties依然活跃
    properties集合是唯一和IO流相关的集合
 */
public class Demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null,"a");//NullPointerException
//        table.put("a",null);//NullPointerException
//        table.put(null,null);//NullPointerException
        System.out.println(table);
    }
}

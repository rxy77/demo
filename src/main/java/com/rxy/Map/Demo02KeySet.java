package com.rxy.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
        Set<K> keySet() 返回此映射中所包含的Set视图
    实现步骤：
        1、使用Map集合中的方法keySet()，把Map集合中的key都取出来，存储到一个Set集合中
        2、遍历Set集合，获取Map集合中的key
        3、通过Map集合方法get(key)，通过key找到value

 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("杨颖",165);
        map.put("林志玲",178);

        //1、使用Map集合中的方法keySet()，把Map集合中的key都取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        //2、遍历Set集合，获取Map集合中的key
        //使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("======================");
        //使用foreach
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("======================");
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}

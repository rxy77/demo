package com.rxy.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
        1、map集合是一个双列集合，一个元素包含2个值(一个key,一个value)
        2、map集合中的元素，key和value数据类型可以相同，也可以不同
        3、map集合中的元素，key不允许重复，value可以重复
        4、map集合中的元素，key和value一一对应

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合特点：
        1、HashMap集合底层是哈希表，查询速度特别快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表/红黑树(链表长度超过8):提高查询速度
        2、HashMap集合是一个无序集合，存储元素和取出元素顺序可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap集合特点：
        1、LinkedHashMap集合底层是：哈希表+链表(保证迭代顺序)
        2、LinkedHashMap集合是一个有序的集合，存储元素和取出元素顺序一致


 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
        bollean containsKey(object key);判断集合中是否包含指定的键
        包含返回true，不包含返回false
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("杨颖",165);
        map.put("林志玲",178);

        boolean b1 = map.containsKey("迪丽热巴");
        System.out.println(b1);//true

        boolean b2 = map.containsKey("热巴");
        System.out.println(b2);//false
    }

    /*
         public V get(object key);根据指定的键，在Map获取相应的值
         返回值:V
                key存在，V返回对应value值
                key不存在，V返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Integer v1 = map.get("杨颖");
        System.out.println(v1);//165

        Integer v2 = map.get("古力娜扎");
        System.out.println(v2);//null


    }

    /*
        public V remove(object key);把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
            返回值:V
                key存在，V返回被删除的值
                key不存在，V返回null

     */
    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("迪丽热巴",170);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 杨颖=165, 迪丽热巴=170}

        Integer v1 = map.remove("林志玲");
        System.out.println(v1);//178

        System.out.println(map);//{杨颖=165, 迪丽热巴=170}

//        int v2 = map.remove("林志颖");//自动拆箱 NullPointerException
        Integer v2 = map.remove("林志颖");
        System.out.println(v2);//null

        System.out.println(map);//{杨颖=165, 迪丽热巴=170}
    }

    /*
        public V put(K key,V Value):把指定的键和值添加到Map集合中
            返回值:V
                存储键值对的时候，key不重复，返回值v是null
                存储键值对的时候，key重复，会用新的value替换map中重复的value值，返回值v是被替换的value值
     */
    private static void show01() {
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 冷锋=龙小云}
    }
}

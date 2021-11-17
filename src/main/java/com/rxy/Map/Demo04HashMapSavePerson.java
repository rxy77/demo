package com.rxy.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型的键值
    Map集合保证key是唯一的
        作为key的元素，必须重写hashcode和equals方法，以保证key唯一
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
        HashMap存储自定义类型的键值
        key:Person类型
            Person类必须重写hashcode和equals方法，保证key唯一
        value:String类型
            可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",20),"秦国");
        map.put(new Person("总统",30),"俄国");
        map.put(new Person("女王",18),"毛里求斯");

        //使用entrySet
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }

    /*
        HashMap存储自定义类型的键值
        key:String类型
            String类重写hashcode和equals方法，保证key唯一
        value:Person类型
            value可以重复(同名同年龄视为同一人)
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("深圳",new Person("王五",20));
        map.put("北京",new Person("赵六",18));

        //使用keyset方法，遍历map
        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}

package com.rxy.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1、不允许重复的元素
        2、没有索引，没有带索引的方法，所以不能使用普通for循环
    java.util.HashSet集合 implements Set接口
    HashSet集合的特点：
        1、不允许重复的元素
        2、没有索引，没有带索引的方法，所以不能使用普通for循环
        3、无序的集合，存储顺序和取出顺序可能不同
        4、底层是一个哈希表结构（查询速度非常快）

 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        //使用迭代器遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println(n);//1,2,3
        }
        //也可使用for each
        for (Integer n : set) {
            System.out.println(n);
        }

    }
}

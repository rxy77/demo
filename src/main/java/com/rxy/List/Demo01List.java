package com.rxy.List;

import java.util.*;

/*
    java.util.list接口 extends Collection接口
    List接口的特点：
        1.有序的集合，存储元素和取出元素的顺序是一致的。（存储123 取出123）
        2.有索引，包含了一些有索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法（特有）
        public void add(int index,E element):将指定的元素，添加到该集合中的指定位置
        public E get(int index):返回集合中指定位置的元素
        public E remove(int index):移除指定位置处的元素，返回的是被移除的元素
        public E set(int index,E element):用将指定的元素替换集合中指定位置的元素，返回值是更新前的元素

    注意：
        操作索引时，一定要防止索引越界异常
        IndexOutOfBoundsException：索引越界异常,集合会报
        ArrayIndexOutOfBoundsException：数组索引越界异常
        StringIndexOutOfBoundsException：字符串索引越界异常

 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list=new ArrayList<>();
        //往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//[a, b, c, d, a]，不是地址，重写了toString()

        //public void add(int index,E element):将指定的元素，添加到该集合中的指定位置
        //在c和d之间，添加test
        list.add(3,"test");
        System.out.println(list);

        //public E remove(int index):移除指定位置处的元素，返回的是被移除的元素
        //移除元素
        String removes = list.remove(2);
        System.out.println("被移除的元素："+removes);
        System.out.println(list);

        //public E set(int index,E element):用将指定的元素替换集合中指定位置的元素，返回值是更新前的元素
        //把最后的a替换为A
        String seted = list.set(4, "A");
        System.out.println("被替换的元素："+seted);
        System.out.println(list);

        //List集合遍历的3中方式
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("=========================");

        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=========================");

        //使用foreach
        for (String s : list) {
            System.out.println(s);
        }

        /*String r = list.get(5);
        System.out.println(r);//IndexOutOfBoundsException索引越界异常*/
    }
}

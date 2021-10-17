package com.rxy.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用方法：
        boolean hasNext() 如果仍有元素可以迭代，则返回true。
            判断集合中还有没有下一个元素，有 返回true，没有 返回false
        E next() 返回迭代的下一个元素。
            取出集合中的下一个元素
        Iterator迭代器，是一个接口，无法直接使用，需要用到Iterator接口的实现类，获取实现类方法比较特殊
        Collection接口中有一个方法：iterator()，这个方法返回的是迭代器的对象
            Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。

        迭代器使用步骤（重点）：
            1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            2.使用Iterator接口中的方法hsaNext()判断还有没有下一个元素
            3.使用Iterator接口中的方法next()取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        coll.add("姚明");
        coll.add("詹姆斯");
        coll.add("科比");
        coll.add("艾弗森");
        coll.add("麦迪");

        /*
            1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            注意：
                Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        //多态 接口                  实现类对象
        Iterator<String> it= coll.iterator();

        /*
            发现使用迭代器取出集合中元素的代码，是一个重复的过程
            所以我们使用循环优化
            不知道集合中有多少元素，使用while循环
            循环结束条件，hasNext()方法返回false
         */

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=======================");
        //使用for循环
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();){
            String e = it2.next();
            System.out.println(e);

        }

        //2.使用Iterator接口中的方法hsaNext()判断还有没有下一个元素
        boolean b=it.hasNext();
        System.out.println(b);

        //3.使用Iterator接口中的方法next()取出集合中的下一个元素
        String s = it.next();
        System.out.println(s);//姚明

        b=it.hasNext();
        System.out.println(b);
        s= it.next();
        System.out.println(s);

        b=it.hasNext();
        System.out.println(b);
        s= it.next();
        System.out.println(s);

        b=it.hasNext();
        System.out.println(b);
        s= it.next();
        System.out.println(s);

        b=it.hasNext();
        System.out.println(b);
        s= it.next();
        System.out.println(s);

        b=it.hasNext();
        System.out.println(b);//没有元素，返回false
        s= it.next();//没有元素，抛出异常NoSuchElementException没有元素异常
        System.out.println(s);
    }
}

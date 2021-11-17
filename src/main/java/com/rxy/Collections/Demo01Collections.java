package com.rxy.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
    java.util.Collections是集合工具类，是用来对集合进行操作，部分方法：
        public static <T> bollean addAll(Collection<T> c,T...elements);往集合中添加一些元素
        public static void shuffle(List<?>  list);打乱集合顺序
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
//        list.add("a");
//        list.add("b");
//        list.add("c");

        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);//[b, a, c, d] [c, d, a, b]每次顺序都不同

    }
}

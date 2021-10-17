package com.rxy.demo.Demo21;

import java.util.ArrayList;
import java.util.List;

/*
java.util.ArrayList正是java.util.List的实现类
 */

public class DemoInterface extends Object{
    public static void main(String[] args) {
        //左边接口，右边实现类，多态写法
        List<String> list =new ArrayList<>();

        List<String> result=addname(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addname(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }
}

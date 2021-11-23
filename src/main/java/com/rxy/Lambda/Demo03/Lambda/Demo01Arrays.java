package com.rxy.Lambda.Demo03.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr={
                new Person("杨幂",30),
                new Person("迪丽热巴",20),
                new Person("古力娜扎",22)
        };

        //对年龄进行排序(升序)
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //使用Lambda简化匿名内部类
//        Arrays.sort(arr,(Person o1, Person o2) -> {
//                return o1.getAge()-o2.getAge();
//        });

        //优化省略Lambda
        Arrays.sort(arr,(o1,o2) -> o1.getAge()-o2.getAge());

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

package com.rxy.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，是用来对集合进行操作，部分方法：
        public static <T> void sort(List<T> list, Comparator<? super T> c);将集合中元素按照默认规则排序

    Comparator和Comparable区别：
        Comparable:自己(this)和别人(参数)进行比较，自己需要实现Comparable接口，重写比较规则compareTo方法
        Comparator:相当于找个第三方裁判，比较两个

    Comparator排序规则：
        o1-o2;升序
        o2-o1;降序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2,6,5);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;//升序
                return o2-o1;//降序
            }
        });
        System.out.println(list);

        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,new Student("a迪丽热巴",20),new Student("古力娜扎",22),new Student("b玛尔扎哈",20));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//按照年龄升序
//                return o2.getAge()-o1.getAge();//按照年龄降序
                //如果两人年龄相同，按照名字首字母排序
                int result=o1.getAge()-o2.getAge();
                if (result==0){
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(students);

    }
}

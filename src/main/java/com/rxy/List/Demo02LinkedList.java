package com.rxy.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合特点：
        1、增删快，查询慢
        2、集合中包含大量首尾元素操作的方法
        注意：使用LinkedList集合特有的方法，不能使用多态

        public void addFirst(E e):将指定元素插入此列表的开头
        public void addLast(E e):将指定元素插入此列表的结尾
        public void push(E e):将元素推入此列表所表示的堆栈，等效于addFirst(E e)

        public E getFirst():返回此列表第一个元素
        public E getLast():返回此列表最后一个元素

        public E removeFirst():移除并返回此列表的第一个元素
        public E removeLast():移除并返回此列表的最后一个元素
        public E pop():从此列表所表示的堆栈弹出一个元素，等效于removeFirst()

        public boolean isEmpty():如果列表不包含元素，则返回true

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }
/*
        public E removeFirst():移除并返回此列表的第一个元素
        public E removeLast():移除并返回此列表的最后一个元素
        public E pop():从此列表所表示的堆栈弹出一个元素，等效于removeFirst()
 */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

//        String s = linked.removeFirst();
        String s = linked.pop();
        System.out.println("移除的首项："+s);

        String s1 = linked.removeLast();
        System.out.println("移除的末项："+s1);



    }

    /*
            public E getFirst():返回此列表第一个元素
            public E getLast():返回此列表最后一个元素
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //linked.clear();//清空集合中的元素，在获取集合元素中会报错NoSuchElementException

        //public boolean isEmpty():如果列表不包含元素，则返回true
        if (!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);

            String last = linked.getLast();
            System.out.println(last);
        }

    }

    /*
            public void addFirst(E e):将指定元素插入此列表的开头
            public void addLast(E e):将指定元素插入此列表的结尾
            public void push(E e):将元素推入此列表所表示的堆栈
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //public void addFirst(E e):将指定元素插入此列表的开头
        //public void push(E e):将元素推入此列表所表示的堆栈,等效于addFirst(E e)
//        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);

        //public void addLast(E e):将指定元素插入此列表的结尾
        linked.addLast("com");
        System.out.println(linked);



    }
}

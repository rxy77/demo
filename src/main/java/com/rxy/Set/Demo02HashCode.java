package com.rxy.Set;
/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，模拟出来的地址，不是数据实际存储的地址）
    在Object类中有一个方法，可以获取对象的哈希值
    int hashcode():返回该对象的哈希码值。
    hashcode方法的源码:
        public native int hashCode();
        native:代表调用的是本地操作系统的方法

 */
public class Demo02HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类中的hashcode方法
        Person p1=new Person();
        int i = p1.hashCode();
        System.out.println(i);//1531448569      |       1

        Person p2 = new Person();
        int i1 = p2.hashCode();

        System.out.println(i1);//1867083167      |       1

        /*
            toString()的源码：
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);//com.rxy.Set.Person@5b480cf9
        System.out.println(p2);//com.rxy.Set.Person@6f496d9f
        System.out.println(p1==p2);//false

        /*
            String类的哈希值
                String类重写Object类的hashcode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}

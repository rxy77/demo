package com.rxy.demoClass;

import java.util.Arrays;

/*
    java.long.System类提供了大量的静态方法，可以获取系统的相关信息和系统级操作

        public static long CurrentTimeMillis()返回以毫秒为单位的当前时间
        public static void arraycopy(object src,int srcPos,object dest,int destPos,int length)将数组中指定数据拷贝到另一数组中
 */
public class DemoSystem {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }
/*
    public static void arraycopy(object src,int srcPos,object dest,int destPos,int length)将数组中指定数据拷贝到另一数组中
    参数：
        object src：源数组
        int srcPos：源数组中的起始位置
        object dest：目标数组
        int destPos：目标数组中的起始位置
        int length：要复制源数组的元素数量
    练习：
        将src数组的前3个元素,复制到dest数组的前3个位置
        复制前：src[1,2,3,4,5],dest[6,7,8,9,10]
        复制后：src[1,2,3,4,5],dest[1,2,3,9,10]
 */
    private static void demo02() {
        //创建源数组
        int[] src={1,2,3,4,5};
        //创建目标数组
        int[] dest={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        //使用System类的arraycopy方法，将src数组的前3个元素,复制到dest数组的前3个位置
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));

    }

    /*
        public static long CurrentTimeMillis()返回以毫秒为单位的当前时间
            用来测试程序运行效率
            练习：
            循环打印1-10000所需时间
     */
    private static void demo01() {
        //程序运行前获取毫秒值
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        //程序运行后，再获取毫秒值
        long l = System.currentTimeMillis();
        System.out.println("此次耗时："+(l-s)+"毫秒");

    }
}

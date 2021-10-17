package com.rxy.demo.Demo04;
/*java.util.Math类是数学相关类，里面提供了大量静态方法，完成数学运算相关操作

public static double abs():获取绝对值
public static double ceil():向上取整
public static double floor():向下取整
public static long round():四舍五入

Math.PI:圆周率近似值*/
public class Demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-2.8));
        System.out.println("============");

        System.out.println(Math.ceil(61.5));
        System.out.println(Math.ceil(12));
        System.out.println("============");

        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(31.1));
        System.out.println("============");

        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.6));
        System.out.println("============");

        System.out.println(Math.PI);
    }
}

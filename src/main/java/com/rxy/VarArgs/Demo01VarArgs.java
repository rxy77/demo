package com.rxy.VarArgs;
/*
    可变参数
    使用前提：
        当方法的类型已经确定，但个数不确定，可以使用可变参数
    使用格式：定义方法时使用
        修饰符 返回类型 方法名(数据类型...变量名){}
    可变参数原理：
        可变参底层就是一个数组，根据传递不同参数个数，来创建不同长度的数组，来存储这些数据
        传递的个数可以是0个(不传递),1,2...多个
    注意事项：
        1、一个方法的可变参数列表，只能有1个
        2、如果方法参数有多个，那么可变参数只能在参数列表的末尾
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
//        int i=add();
//        int i=add(10);
//        int i=add(10,20);
        int i=add(10,20,30,40,50,60,70);
        System.out.println(i);

        method(1,"string",12.3,14.4,15.6);
        methodobj("12",12,13.4,1,true);

    }
   /* //定义一个方法计算2个整数的和
    public static int add(int a,int b){
        return a+b;
    }
    //定义一个方法计算3个整数的和
    public static int add(int a,int b,int c){
        return a+b+c;
    }*/

    /*
    定义一个方法计算0-n个整数的和
    已知类型，但不确定有几个参数
    此时使用可变参数
    add();就会创建一个长度为0的数组,new int[0]
    add(10);就会创建一个长度为1的数组,new int[1]{10}
    add(10,20);就会创建一个长度为2的数组,new int[2]{10,20}
    add(10,20,30,40,50,60,70);就会创建一个长度为7的数组,new int[7]{10,20,30,40,50,60,70}
     */
    public static int add(int...arr){
        //System.out.println(arr);//[I@3feba861 底层是数组
        //System.out.println(arr.length);//0
        //创建一个int变量存储累加求和
        int sum=0;
        //遍历数组
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static void method(int a,String b,double...c){

    }
    //可变参数终极写法(Object...obj)
    public static void methodobj(Object...obj){

    }


}

package com.rxy.demo.hello;

public class demovariabledifference {
    String name;//成员变量
    public void methodA(){
        int num=20;//局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){//方法的参数就是局部变量
        //参数在方法调用时必然被赋值
        System.out.println(param);
        int age;//局部变量
        //System.out.println(age);//没赋值不能用
        //System.out.println(num);//错误写法
        System.out.println(name);
    }
}

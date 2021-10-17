package com.rxy.demo.Demo10;
/*
注意事项：接口的静态方法不能通过实现类的对象来调用
正确用法：接口的静态方法直接通过接口名称调用
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl inter=new MyInterfaceStaticImpl();
        //错误写法
//        inter.methodStatic();

        //正确写法
        MyInterfaceStatic.methodStatic();
    }
}

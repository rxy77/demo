package com.rxy.demo.Demo14;
/*
向上转型一定是安全的，没有问题的，正确的。但有一个弊端：
对象一旦向上转型为父类，那么就无法调用原来子类的内容

解决方案：对象向下转型【还原】(向下转型一定要进行instanceof判断)
 */

public class Demo01 {
    public static void main(String[] args) {
//        对象向上转型，就是：父类引用指向子类对象
        Animal animal=new Cat();//本来创建的是一只猫
        animal.eat();

//        animal.catchmouse();//错误写法

//        向下转型，"还原"动作
        Cat cat=(Cat) animal;
        cat.catchMouse();
        System.out.println("===================");

        //下面是错误的向下转型
        //本来new的是猫，现在转型为dog
        //ClassCastException，类转换异常
        Dog dog=(Dog) animal;//错误写法，编译不会报错，但运行会异常，
    }


}

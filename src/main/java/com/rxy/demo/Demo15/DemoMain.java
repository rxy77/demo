package com.rxy.demo.Demo15;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();//创建一个笔记本
        computer.powerOn();

//        Mouse mouse=new Mouse();//准备一个鼠标，供电脑使用

        //准备向上转型
        USB usbMouse=new Mouse();//多态写法
        //参数是USB类型，传进去的刚好是USB
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();//没有使用多态
        //方法参数是USB类型，传进去的是实现类对象
        computer.useDevice(keyboard);//正确写法.也发生了向上转型
//        computer.useDevice(new Keyboard());//也是正确写法
        //使用子类对象，匿名对象也可以


        computer.powerOff();

        System.out.println("=================");
        method(10.0);//正确写法。double--->double
        method(10);//正确写法。int--->double
        int a=1;
        method(a);//正确写法。int--->double
    }

    public static void method(double num){
        System.out.println(num);
    }
}

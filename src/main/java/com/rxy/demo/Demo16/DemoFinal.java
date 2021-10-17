package com.rxy.demo.Demo16;
/*
final代表最终的、不可改变的
四种用法：
1、可以修饰一个类
2、可以修饰一个方法
3、修饰一个局部变量
4、修饰一个成员方法
 */
public class DemoFinal {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=200;
        System.out.println(num1);
        System.out.println("===============");

        //一旦使用final修饰局部变量，那么这个变量就不可修改
        //"一次赋值，终生不变"
        final int num2=100;
        System.out.println(num2);
//        num2=200;//错误写法！final修饰的变量，只能赋值一次
//        num2=30;

        final int num3;
        num3=10;//正确写法，保证只赋值唯一一次即可

        System.out.println("===============");


        //对于基本类型来说，不可变说的是变量的数据不可变
        //对于引用类型来说，不可变说得是变量的地址值不可变

        Student stu1=new Student("赵丽颖");
        System.out.println(stu1.getName());//赵丽颖
        stu1=new Student("霍建华");
        System.out.println(stu1.getName());//霍建华
        System.out.println("===============");

        final Student stu2=new Student("易洋千玺");
        System.out.println(stu2.getName());
//        stu2=new Student("赵又廷");//错误写法，引用类型中的地址值不可改变
        stu2.setName("赵又廷");//地址值不可改变，但地址所指向的内容可以改变
        System.out.println(stu2.getName());
    }
}

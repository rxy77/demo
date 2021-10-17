package com.rxy.demo.Demo16;
/*
对于成员变量来说，final修饰成员变量，那这个变量照样不可变

1、由于成员变量具有默认值，所以用了final修饰，则必须手动赋值，不会再给默认值
2、对于final的成员变量，要么直接赋值(直接赋值，则构造方法不可赋值)，要么构造方法赋值(构造方法赋值，则不可直接赋值)，二者选其一
3、必须保证类当中所有重载的构造方法，都最终会对final对成员变量进行赋值
 */
public class Person {
    final private String name/*="鹿晗"*/;

    public Person(){
        name="赵又廷";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/
}

package com.rxy.demo.Demo13;
/*
多态性：父类引用指向子类对象
格式：
父类名称 对象名=new 子类名称();
接口名称 对象名=new 实现类名称();

访问成员变量2中方式：
1、直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上查找
2、间接通过成员方法访问，看方法属于谁，优先用谁，没有则向上查找

成员方法的访问规则：
    看new的是谁，优先用谁，没有则想上查找

口诀：
    编译看左边，运行看右边

对比：
    成员变量：编译看左边，运行还看左边
    成员方法：编译看左边，运行看右边
 */
public class Demo01Multi {
    public static void main(String[] args) {
        Fu obj=new Zi();
        obj.method();
        obj.methodFu();
        System.out.println(obj.num);//父，10
//        System.out.println(obj.age);//错误写法

//        obj.showNum();//父，10
        obj.showNum();//子，20
        System.out.println("==============");

        //编译看左，运行看右，左边是Fu，Fu有method()，运行看右，运行子类(Zi)的method()
        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，向上找，父类用，用父类

        //编译看左，运行看右，左边是Fu，Fu没有methodZi()方法，所以编译失败
//        obj.methodZi();//错误写法

    }
}

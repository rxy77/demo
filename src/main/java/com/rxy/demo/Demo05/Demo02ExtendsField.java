package com.rxy.demo.Demo05;
/*
在父子类的继承中，如果成员变量重名，则创建子类对象时，访问有两种方式：

通过子类对象直接访问：
    等号左边(或.号)是谁，优先使用谁，如没有则向上(父类)查找
通过成员方法访问:
    该方法属于谁，优先使用谁，如没有则向上(父类)查找
*/

public class Demo02ExtendsField {
    public static void main(String[] args) {
        //创建一个父类对象
      /*  Fu fu=new Fu();
        System.out.println(fu.numFu);//父类对象只能访问父类的内容，没有任何子类的内容，也不知道子类是谁

        //创建一个子类对象
        Zi zi=new Zi();
        System.out.println(zi.numFu+","+ zi.numZi);
        System.out.println("============");

        //等号左边是谁，优先使用谁
        System.out.println(zi.num);//优先子类，200
//        System.out.println(zi.abc);//到处都没有，编译报错

        System.out.println("============");
        //优先使用子类，子类没有向上找父类的
        zi.methodZi();
        //属于父类的方法
        zi.mathodFu();*/


    }


}

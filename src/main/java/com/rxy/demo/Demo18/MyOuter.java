package com.rxy.demo.Demo18;
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须就是【有效final】

备注：从java8+开始，只要局部变量是final事实不变，那么final关键字就可以省略

原因：
1、new出来的对象在堆内存当中
2、局部变量跟着方法走，在栈内存当中
3、方法运行结束后，立刻出战，局部变量消失
4、但new出来的对象会持续存在堆内存当中，直到垃圾回收

补充：当局部变量消失，如果new出来的对象还想继续使用局部变量，那么局部变量就需为【有效final】，不然无法使用，
局部变量总是变化，对象不知道局部变量的值为什么
 */
public class MyOuter {
    public void methodOuter(){
        /*final*/ int num=10;
//        num=12;局部变量需为final，即使不写，也许事实成立

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
